/*문제 피라미드
baseline에 블록 n개를 시작으로 n-1개씩 위에 쌓여서, 0개가 되면 끝남. 필요한 총 블록을 구해야함.
입력: baseline 을 구성하는 n의 개수에 대한 리스트(리스트 형태는 아니며 수의 나열이다) (양수인 정수), 0이 입력되면 입력이 끝난 것.

어떻게 해결할 것인가?(로직)
재귀함수 이용 -> sum에 n(처음엔 baseline)을 더하는 함수 작성, 이후 n=0이 될 때까지 n-1을 더하는 함수로 계속 호출, 이후 n == 0이 되면 sum 값을 리턴.
baseLine은 여러개가 입력된다. 이를 어떻게 받을 것인가. -> br.readLine()은 한줄 단위를 String으로 읽어온다.
각각의 Integer.parseInt(br.readLine()) 을 1의 메소드가 있는 클래스의 객체에 인수로 넣자.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Calculate{

	int sum;

	public Calculate(){
		this.sum = 0;
	}

	int result(int a){
		sum += a;
		if(a == 0){
			return sum;
		}
		return(result(a-1));
	}

}

public class Pyramids3{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
        int a = Integer.parseInt(br.readLine());
        
        // 0이 입력되면 즉시 루프를 탈출한다.
        if (a == 0) {
            break;
        }
        
        // 0이 아닌 경우에만 계산하고 출력한다.
        Calculate cc = new Calculate();
        bw.write(String.valueOf(cc.result(a)));
        bw.newLine();
    }// 더 나은 로직 알아보기
		bw.close();
		br.close();
}
}
