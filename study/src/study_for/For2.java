package study_for;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
		//첫째 줄에 테스트 케이스의 개수 T
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A + B);
		}

	}

}
