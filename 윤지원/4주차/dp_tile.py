import sys

input = sys.stdin.readline

MOD=10007

def count(n):
    #if dp[n]!=0:
        #return dp[n]
    if n==1:
        return dp[1]
    elif n==2:
        return dp[2]
    else:
        dp[n]=(count(n-1)+count(n-2))%MOD
        return dp[n]

n=int(input())
dp = [1] *(n+1)
dp[0]=0
dp[1]=1
dp[2]=2

for i in range(n):
    print(count(i)%MOD)
    
    
