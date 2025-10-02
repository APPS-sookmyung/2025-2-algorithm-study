import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class CardGame2{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        for(int i = 0; i < 5; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
		int sum = 0;
		for(int a : numbers){
			sum += a;
		}
        bw.write(String.valueOf(sum));
        bw.close();//?
	}
}