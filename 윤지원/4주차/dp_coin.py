import sys

input = sys.stdin.readline

# 입력: n(동전 종류 수), k(목표 금액)
n, k = map(int, input().split())

# 동전 목록: n줄에 걸쳐 한 줄에 하나씩
coins = [int(input().strip()) for _ in range(n)]

inf= k+1
dp = [inf] * (k + 1)
dp[0] = 0  

# 동전은 무한 사용 가능 
for c in coins:
    for s in range(c, k + 1):
        if dp[s-c]+1 <dp[s]:
            dp[s] = dp[s - c]+1 

print(dp[k]if dp[k]!=inf else -1)
