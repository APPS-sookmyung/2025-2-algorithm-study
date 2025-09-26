import java.util.Scanner;

public class safariWorld{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	long n = scan.nextInt();
	long m = scan.nextInt();

	long c = (n-m)>0 ? n-m : -(n-m);// n-m을 할 때 오버플로우 발생 가능 -> int 대신 long을 사용해야함. 이 때, 삼항연산자에 형변환 쓰면 안됨. 이미 n-m은 끝났기 때문임.
	System.out.print(c);
	}
}
