package study_for;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int hap = 0;
		
		for(int i=1; i<=num; i++) {
			
			hap += i;
			
		}
		
		System.out.println(hap);

	}

}
