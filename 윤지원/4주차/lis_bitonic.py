import sys
input = sys.stdin.readline

def lis_length_n2(arr):
    """O(N^2) 증가 부분수열 길이 (A[i]에서 끝나는 최장 길이를 dp[i]에 저장)"""
    n = len(arr)
    dp = [1] * n
    for i in range(n):
        for j in range(i):
            if arr[j] < arr[i]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp) if n else 0

def lds_length_n2(arr):
    """O(N^2) 감소 부분수열 길이 (A[i]에서 끝나는 최장 '감소' 길이)"""
    n = len(arr)
    dp = [1] * n
    for i in range(n):
        for j in range(i):
            if arr[j] > arr[i]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp) if n else 0

def longest_bitonic_subseq_length(arr):
    """
    O(N^2) 최장 바이토닉 부분수열 길이.
    inc[i] = i에서 끝나는 LIS 길이
    dec[i] = i에서 시작하는 LDS 길이  (뒤에서부터 구하거나, 배열 뒤집어서 LIS를 구해도 됨)
    답 = max_i inc[i] + dec[i] - 1
    """
    n = len(arr)
    if n == 0:
        return 0

    # 1) inc[i]: i에서 끝나는 LIS 길이
    inc = [1] * n
    for i in range(n):
        for j in range(i):
            if arr[j] < arr[i]:
                inc[i] = max(inc[i], inc[j] + 1)

    # 2) dec[i]: i에서 시작하는 LDS 길이 (뒤에서 앞으로)
    dec = [1] * n
    for i in range(n - 1, -1, -1):
        for j in range(n - 1, i, -1):
            if arr[j] < arr[i]:  # i에서 시작해서 내려가야 하므로 arr[i] > arr[j]
                dec[i] = max(dec[i], dec[j] + 1)

    # 3) i를 꼭짓점으로 하는 bitonic 길이 합치기
    ans = 0
    for i in range(n):
        ans = max(ans, inc[i] + dec[i] - 1)
    return ans

def main():
    N = int(input().strip())
    arr = list(map(int, input().split()))
    print(longest_bitonic_subseq_length(arr))

if __name__ == "__main__":
    main()
