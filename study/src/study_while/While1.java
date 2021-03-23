package study_while;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			int sum = i+j;
			
			if(sum != 0) {
				System.out.println(sum);
			}
			else {
				break;
			}
		}

	}

}
