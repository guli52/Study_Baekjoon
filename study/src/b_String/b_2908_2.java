package b_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b_2908_2 {

	public static void main(String[] args) throws IOException {
		// 수학연산으로 계산하기
		//Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		int a1 = ((a%10)*100)+((a%100)-(a%10))+(a/100);
		int b1 = ((b%10)*100)+((b%100)-(b%10))+(b/100);

		System.out.println(a1>b1?a1:b1); 

	}

}
