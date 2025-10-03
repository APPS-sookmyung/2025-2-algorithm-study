import sys

input = sys.stdin.readline

def solve():
    n, m = map(int, input().split())
    grid = [list(map(int, input().split())) for _ in range(n)]
    dp = [0] * m
    dp[0] = grid[0][0]

    for j in range(1, m):
        dp[j] = dp[j-1] + grid[0][j]

    for i in range(1, n):
        dp[0] += grid[i][0]
        for j in range(1, m):
            dp[j] = max(dp[j], dp[j-1]) + grid[i][j]


    print(dp[m-1])


t = int(input())
for _ in range(t):
    solve()

