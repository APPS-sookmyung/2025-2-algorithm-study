import sys

# 테스트 케이스의 수 t를 입력받습니다.
t = int(sys.stdin.readline())

for _ in range(t):
    n = int(sys.stdin.readline())
    s = sys.stdin.readline().strip()
    
    # 문자열 s를 뒤집어 rev를 만듭니다.
    rev = s[::-1]
    
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    
    # DP 테이블을 채워나갑니다. (LCS 알고리즘)
    # i는 원본 문자열 s의 인덱스, j는 뒤집은 문자열 rev의 인덱스에 해당합니다.
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            # 두 문자가 같다면, 대각선 위의 값에 1을 더합니다.
            if s[i-1] == rev[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
            # 두 문자가 다르다면, 위쪽 값과 왼쪽 값 중 더 큰 값을 가져옵니다.
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])
                
    # 최종 결과인 dp[n][n]을 출력합니다.
    print(dp[n][n])
