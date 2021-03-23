package study_for;

import java.io.*;

public class For9_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}
