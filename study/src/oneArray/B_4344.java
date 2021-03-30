package oneArray;

import java.util.Scanner;

public class B_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int c = sc.nextInt();	//테스트 개수
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();	//각 테스트 마다의 학생수
			int[] score = new int[n];
			double sum=0;
			
			for(int j=0; j<n; j++) {
				score[j] = sc.nextInt();	//각 테스트의 점수 입력
				sum += score[j];			//각 테스트의 점수 합계
			}
			
			double mean = sum/n;	//평균구하기
			double count = 0;		//평균 넘는 학생수
			
			for(int j=0; j<n; j++) {
				if(mean<score[j]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/n)*100);	//소수점을 표기하기 위해 printf사용
		}
		sc.close();
	}

}
