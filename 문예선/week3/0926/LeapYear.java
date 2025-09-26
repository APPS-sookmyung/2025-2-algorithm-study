/*
문제 윤년
입력 1<= n<=4000, 자연수

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class LeapYear {
	public static void main(String[]args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int a = Integer.parseInt(br.readLine());

    String T = "1";
    String F = "0"; // 생각해보니 이 코드가 굳이 필요하진 않은 듯
	if(((a%4 == 0 ) && (a%100 !=0) || (a%400 == 0))){
		bw.write(T);
		
	}else{
		bw.write(F);
	}
	bw.close();
    br.close();
	}

}