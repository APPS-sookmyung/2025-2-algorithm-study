import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays; // sort 메서드가 있는 클래스

class Pokemon implements Comparable<Pokemon> { // 이름 기준 정렬을 위한 Comparable 구현
    String name;
    int number;

    Pokemon(String name, int number) {
        this.name = name;
        this.number = number;
    }

=    @Override
    public int compareTo(Pokemon other) {
        return this.name.compareTo(other.name);
    }
}

public class PocketmonMasterWithBinary { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] numToName = new String[N + 1]; //포켓몬 번호는 1부터 N까지로 지정

        Pokemon[] nameSortedPokedex = new Pokemon[N];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numToName[i] = name;
            nameSortedPokedex[i - 1] = new Pokemon(name, i);
        }

        Arrays.sort(nameSortedPokedex);

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            try {
                int num = Integer.parseInt(input);

                bw.write(numToName[num]);

            } catch (NumberFormatException e) {

                int start = 0;
                int end = N - 1;
                int answer = -1;

                while (start <= end) {
                    int mid = (start + end) / 2;
                    int compareResult = nameSortedPokedex[mid].name.compareTo(input);

                    if (compareResult == 0) {}
                        answer = nameSortedPokedex[mid].number;
                        break;
                    } else if (compareResult < 0) {}
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                bw.write(String.valueOf(answer));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}