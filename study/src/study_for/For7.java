package study_for;

import java.io.*;
import java.util.StringTokenizer;

public class For7 {

	public static void main(String[] args) throws Exception{
		// 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int result = A+B;
			
			bw.write("Case #" + i + ": " + result + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
