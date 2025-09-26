import sys
read = sys.stdin.readline
write = sys.stdout.write

def hanoi(n: int, src: str, aux: str, dst: str, out: list):
    if n == 0:
        return
    # 1) n-1개를 src -> aux (dst를 보조로)
    hanoi(n-1, src, dst, aux, out)
    # 2) 가장 큰 원판 n을 src -> dst
    out.append(f"{src} {dst} {n}\n")
    # 3) n-1개를 aux -> dst (src를 보조로)
    hanoi(n-1, aux, src, dst, out)

def main():
    t = int(read().strip())
    out = []
    for _ in range(t):
        n = int(read().strip())
        hanoi(n, 'A', 'B', 'C', out)   # 매 케이스마다 A->C 로 옮김
    write(''.join(out))

if __name__ == "__main__":
    main()
