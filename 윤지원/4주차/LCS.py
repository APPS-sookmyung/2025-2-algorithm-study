import sys

input = sys.stdin.readline

def lis_length_n2(arr):
    n = len(arr)
    dp = [1] * n  # LIS_last[i] 초기값 1 (자기 자신만)
    for i in range(n):
        for j in range(i):
            if arr[j] > arr[i]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp)

def main():
    a1=input()
    a2=input()
   
        
        
    print(lis_length_n2(arr),arr)

if __name__ == "__main__":
    main()

"""
여기서 두 수열이 주어졌을 떄, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾게 하려ㅕ면 위 코드에서 어디를 고쳐야 할
"""
