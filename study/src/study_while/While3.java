package study_while;

import java.util.Scanner;

public class While3 {
	
	public static void main(String[] args) {
		
		//시간초과
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int o = a;
		int n = 0;
		
		while(true) {
			
			int i = a/10;
			System.out.println("i=" + i);
			int j = a%10;
			System.out.println("j=" + j);
			
			int s = i+j;
			System.out.println("s=" + s);
			
			 a = (j*10) + (s%10);
			//System.out.println("b=" + b);
			
			//a=b;
			//System.out.println("a=" + a);
			
			n++;
			System.out.println("n="+ n);
	
			if(o==a) {
				System.out.print(n);
				break;
			}
			
		}
	}

}
