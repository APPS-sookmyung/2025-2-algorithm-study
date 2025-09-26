import java.util.Scanner;
import java.math.BigDecimal;
public class longNumber{
	public static void main(String[]args){
		Scanner scan =new Scanner(System.in);
		BigDecimal a = new BigDecimal(scan.next());
		BigDecimal b = new BigDecimal(scan.next());
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));

	}
}
