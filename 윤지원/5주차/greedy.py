import sys
import heapq

def min_rooms(lectures):
    # lectures: list of (start, end)
    lectures.sort(key=lambda x: (x[0], x[1]))  # 시작, 동률이면 종료

    heap = []  # 각 방의 '다음 사용 가능 시각' = 종료시간 (min-heap)
    for s, e in lectures:
        if heap and heap[0] <= s:
            # 가장 빨리 끝난 방 재사용
            heapq.heapreplace(heap, e)
        else:
            # 새 방 필요
            heapq.heappush(heap, e)
    return len(heap)

def main():
    input = sys.stdin.readline
    n = int(input())
    lectures = []
    for _ in range(n):
        _id, s, e = map(int, input().split())  # id는 결과에 영향 없음
        lectures.append((s, e))
    print(min_rooms(lectures))

if __name__ == "__main__":
    main()
