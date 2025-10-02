/* 문제 피라미드
baseline에 블록 n개를 시작으로 n-1개씩 위에 쌓여서, 0개가 되면 끝남. 필요한 총 블록을 구해야함.
입력: baseline 을 구성하는 n의 개수에 대한 리스트(리스트 형태는 아니며 수의 나열이다) (양수인 정수), 0이 입력되면 입력이 끝난 것.
*/
/*
import java.io.IOExcept;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Input{
	public Input(){
		Int a;
		ArrayList<Integer> numbers = new ArrayList<>();
	}
	void read(){	
		do{
				a = Integer.parseInt(br.readLine());
				numbers.add(a);
			}
		while (a != 0)
	}
	int calculate(){
		if (nubers[n] == 0){
			return 0;
		}
		sum += numbers[n];
		calculate(numbers[n]-1);
	}
}
public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferdReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Input input1 = new Input();
		bw.close();
		br.close();
}
}
*/
/*
미완성... 사유: 재귀 로직 설계 및 객체지향 설계 미숙.
내일 다시 도전할 것.
*/