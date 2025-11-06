import sys

# 빠른 입력을 위해 sys.stdin.readline 사용
input = sys.stdin.readline

# 문제의 제약조건에 따라 MOD와 최대 n 값 설정
MOD = 25919
MAX_N = 1000000

# DP 테이블 생성 (최대 n 값 + 1 크기)
dp = [0] * (MAX_N + 1)

# 기초 값(Base Case) 설정
dp[0] = 1
dp[1] = 1
dp[2] = 1
dp[3] = 2

# 점화식을 이용해 DP 테이블을 끝까지 채운다 (사전 계산)
for i in range(4, MAX_N + 1):
    # n번째 돌에 도달하는 방법의 수는 (n-1), (n-3), (n-4)에서 오는 방법의 합
    dp[i] = (dp[i-1] + dp[i-3] + dp[i-4]) % MOD

# 테스트 케이스의 수 t를 입력받음
t = int(input())

# t번 반복하면서 n을 입력받고, 미리 계산해둔 dp[n] 값을 출력
for _ in range(t):
    n = int(input())
    print(dp[n])
