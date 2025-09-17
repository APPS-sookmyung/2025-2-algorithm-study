import java. math. BigInteger;
import java.util.Scanner;

public class veryRich
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		/*******
		 int n, m;
		int의 경우 입력 조건으로 주어진만큼의 큰 수를 담지 못한다.
		따라서 BigInteger 객체 자료형을 사용해야 한다.
		<BigInteger 사용법>
		BigInteger는 메모리가 허용하는 한도내의 정수 저장, 연산 가능
		java.math 패키지에 포함됨.
		객체 생성하듯 생성하면 되고, 인수로 scan.next() 배치 가능.
		<주요 연산 메소드 사용법>
		BigInteger 변수명 = 객체.divide(또 다른 객체);
		 			= 	. remainder
		********/

		BigInteger n = new BigInteger(scan.next());
		BigInteger m =new BigInteger(scan.next());
		// BigInteger n = new BigInteger(scan.nextInt());
		// BigInteger m = new BigInteger(scan.nextInt());
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		
		scan.close();
	}
}