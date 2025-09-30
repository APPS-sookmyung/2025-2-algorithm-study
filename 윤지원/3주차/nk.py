import sys

MOD = 25919
read = sys.stdin.readline

t = int(read())
out = []
for _ in range(t):
    n, k = map(int, read().split())
    print((str(pow(n, k, MOD))))   # O(log k)

