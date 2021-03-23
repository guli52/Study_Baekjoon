package study_for;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		
		//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램
		//출력형식과 같게 N*1부터 N*9
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++ ) {
			
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}
	}
}
