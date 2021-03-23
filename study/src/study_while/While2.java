package study_while;

import java.util.Scanner;

public class While2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			System.out.println(i+j);
		}
		
	}

}
