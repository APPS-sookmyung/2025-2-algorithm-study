import sys

def lis_length_n2(arr):
    n = len(arr)
    dp = [1] * n  # LIS_last[i] 초기값 1 (자기 자신만)
    for i in range(n):
        for j in range(i):
            if arr[j] < arr[i]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp)

def main():
    t=int(input())
    for i in range(t):
        input = sys.stdin.readline
        N = int(input().strip())
    arr = list(map(int, input().split()))
    print(lis_length_n2(arr))

if __name__ == "__main__":
    main()

"""
가장 긴 감소하는 부분 수
"""
