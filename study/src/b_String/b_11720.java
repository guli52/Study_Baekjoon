package b_String;

import java.util.Scanner;

public class b_11720 {

	public static void main(String[] args) {
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		String num = sc.next();
		sc.close();
		
		int sum=0;

		for(int i=0; i<n; i++) {
			sum+=num.charAt(i)-'0';
		}
		
		System.out.println(sum);

	}

}
