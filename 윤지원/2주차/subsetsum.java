/**
 *문제: N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 정수의 개수를 나타내는 N과 정수 S 가 주어진다
 * 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어짐. n <= 10^5
 *
 * 출력: 첫째 줄에 합이 S가 되는 부분수열의 개수를 출력한다
 *
 * 풀이: 완전탐색 (2^N) 체택.
 * 각 원소에 대해 선택, 선택 X 두 가지 선택지를 재귀적으로 진행 -dfs 함수 활용
 * 모든 가능한 부분집합을 만들어서 그 합이 S 인지 확인
 * 인덱스가 끝에 도달했을때 도달합이 S 면 카운트
 * 크기가 양수인 부분수열이므로 공집합은 제외 -> 전 탐색 후 S ==0 이면 공집합 1가지를 빼기
 *
 *
 */
import java.io.*;
import java.util.*;

public class subsetsum {
    static int N, S;
    static int[] arr;
    static int count = 0;

    // DFS: 각 원소를 포함하거나 포함하지 않는 모든 경우 탐색
    static void dfs(int index, int currentSum) {
        // BaseLine: 모든 원소를 확인했을 때
        if (index == N) {
            if (currentSum == S) {
                count++;
            }
            return;
        }
        // 현재 원소를 포함하지 않는 경우
        dfs(index + 1, currentSum);
        // 현재 원소를 포함하는 경우
        dfs(index + 1, currentSum + arr[index]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 모든 부분집합 탐색 (공집합 포함)
        dfs(0, 0);

        // 크기가 양수인 부분수열만 구하므로 공집합 제외
        // S가 0인 경우에만 공집합이 조건을 만족하므로
        if (S == 0) {
            count--;
        }

        System.out.println(count);
    }
}