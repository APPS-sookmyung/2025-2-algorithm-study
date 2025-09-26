/*
문제 킹, 퀸, 룩, 비숍, 나이트, 폰
입력: 0이상, 10 이하의 정수 여러개
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String chessPiece = br.readLine();

		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(chessPiece);
		int king = 1 - (Integer.parseInt(st.nextToken()));
		int queen = 1 - (Integer.parseInt(st.nextToken()));
		int rook = 2 - (Integer.parseInt(st.nextToken()));
		int bishop = 2 - (Integer.parseInt(st.nextToken()));
		int knight = 2 - (Integer.parseInt(st.nextToken()));
		int pawn = 8 - (Integer.parseInt(st.nextToken()));
		sb.append(king).append(" ").append(queen).append(" ").append(rook).append(" ").append(bishop).append(" ").append(knight).append(" ").append(pawn);
		bw.write(sb.toString());
        bw.close();
        br.close();
	}
}