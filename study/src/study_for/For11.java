package study_for;

import java.util.Scanner;

public class For11 {

	public static void main(String[] args) {
		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] A = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			if(A[i]<x) {
				System.out.print(A[i] + " ");
			}
			//A[i]= (int)(Math.random()*A.length)+1;
			//System.out.println(A[i]);
			/*if(A[i] < n) {
				System.out.print(A[i] + " ");
			}*/
		}
	
		/*for(int j=0; j<n-1; j++) {
			System.out.print(A[j] + " ");
		}*/
	}

}
