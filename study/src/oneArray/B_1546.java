package oneArray;

import java.util.Scanner;

public class B_1546 {

	public static void main(String[] args) {
		// 최댓값=M, 점수/M*100, 평균구하기
		//소수를 나타내기 위해서 double로 해줘야함
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] score = new double[n];
		
		for(int i=0; i<n; i++) {
			score[i]=sc.nextInt();
		}
		sc.close();
		
		// 최댓값 구하기
		double max=0.0;
		for(int i=0; i<n; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		
		//점수구하기
		for(int i=0; i<n; i++) {
			score[i] = score[i]/max*100;
		}
		
		//총합구하기
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += score[i];
		}
		
		//평균구하기
		double mean = sum/n;
		
		System.out.println(mean);	

	}

}
