package study_for;

import java.io.*;

public class For5_2 {

	public static void main(String[] args) throws Exception {
		// 버퍼이용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++) {
			
			bw.write(i + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
