import java.io.*;
import java.util.*;

class subsetsum2 {
    static int n, target;
    static int[] X;

    // boolean을 반환하는 DFS
    static boolean dfs(int index, int currentSum) {
        // base case
        if (index == n) {
            return currentSum == target;
        }

        // 현재 원소 미포함 또는 포함 중 하나라도 true면 true 반환
        return dfs(index + 1, currentSum) || dfs(index + 1, currentSum + X[index]);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //테스트 케이스 입력받기

        for (int j = 0; j < t; j++) {
            n = sc.nextInt(); //size n of X
            X = new int[n];
            for (int i = 0; i < n; i++) {
                X[i] = sc.nextInt(); //X
            }
            target = sc.nextInt();
            //부분수열 존재- yes , 존재X - no 출력 간단히
            System.out.println(dfs(0, 0) ? "YES" : "NO");
        }
    }
}