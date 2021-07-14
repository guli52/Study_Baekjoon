package b_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2675 {

	public static void main(String[] args) throws IOException {
		// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성. 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			String S = str[1];
			
			String P = "";
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					P += S.charAt(j);
					
				}
				System.out.println("?");
			}
			System.out.println(P);
			
		}
	}

}
