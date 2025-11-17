
  import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class PocketmonMaster throws IOException{
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(br.readLine);
	int capacity = Integer.parseInt(st.nextToken());
	int answerNum = Integer.parseInt(st.nextToken());
	String arr[] = new String[capacity];
	for(int i =0; i<capacity; i++){
		arr[i] = br.readLine;
	}
	try(Integer.parseInt(br.readLine()))catch(NumberFormatException.m){
        /***************************
문법 오류, 시간복잡도 불만족..
    *시간복잡도를 만족하지 못하는 이유 = capacity는 최대 100000, answerNum도 최대 100000이므로 이를 반복하면 100000*100000 = 10,000,000,000이 되어 시간초과가 발생함.
     ****************************/

			for(int j= 0; j<capacity; j++){
					if(arr[j] == m){
					System.out.printf("%d\n", j);
					}
				}
			}
		}
    }
}
  
