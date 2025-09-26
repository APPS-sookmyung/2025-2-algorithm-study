import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[]args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader는 InputStreamReader와 연결해 System.in에 접근. 다만 모든 입력을 String으로 받음.
		
	StringTokenizer st = new StringTokenizer(br.readLine()); 
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	int c= Integer.parseInt(st.nextToken());
	int d = Integer.parseInt(st.nextToken());
	int e = Integer.parseInt(st.nextToken());

	int sum =( a*a+b*b+c*c+d*d+e*e)%10;

	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	bw.write(String.valueOf(sum));
	bw.flush();
	bw.close();
}
}