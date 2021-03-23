package study_if;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
		//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		//원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if((M-45) < 0) {
			
			if(H == 0) {
				
				System.out.println(23 + " " + (M+15));
				
			}else {
				
				System.out.println(H-1 + " " + (M+15));
				
			}
		}else {
			
			System.out.println(H + " " + (M-45));
			
		}
		
		/*
		int EM = M-45;
		
		if(EM < 0 && (H-1) > 0) {
			
			System.out.println((H-1) + " " + (EM+60));
			
		}else if (EM < 0 && (H-1) < 0) {
			
			System.out.println(23 + " " + (EM+60));
			
		}else {
			
			System.out.println(H + " " + EM);
		
		}
		*/

	}

}
