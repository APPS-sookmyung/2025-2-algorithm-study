import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java. io. InputStreamReader;
import java.io.OutputStreamWriter;

public class multiplication {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int a =Integer.parseInt( br.readLine());
		for(int i = 1; i <10; i++ ){
			sb.append(a).append(" * ").append(i).append(" = ").append(a*i).append("\n");
			
		}
		String finalString = sb.toString();
		bw.write(finalString);
		br.close();
		bw.flush();
		bw.close();

	}
}