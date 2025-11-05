import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
//재정리
//버퍼-스트림-시스템
//io예외처리
//stringtokenizer - 공백기준으로 문자열 나누기

import java.util.Arrays;

public class BinarySearch{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    int[] arr;

    public void input() throws IOException{
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }

    public int binarySearch(int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public void process() throws IOException{
        input();
        int target = Integer.parseInt(br.readLine());
        int result = binarySearch(target);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws IOException{
        BinarySearch bs = new BinarySearch();
        bs.process();
    }

}