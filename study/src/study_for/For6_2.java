package study_for;

import java.io.*;

public class For6_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=num; i>=1; i--) {
			
			bw.write(i + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
