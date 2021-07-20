package b_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2908 {

	public static void main(String[] args) throws IOException {
		/*
		 1. 세 자리 수 두개 입력받기
		 2. 각 수를 뒤집어서 나타냄 ex)734->437, 893->398
		 3. 둘 중 큰 수 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(a>b?a:b);


	}

}
