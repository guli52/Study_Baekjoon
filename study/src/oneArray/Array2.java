package oneArray;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램
	
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];	//백준에서는 max=0으로 해야 맞음
		int x=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
				x=i+1;
			}
		}
		 
		System.out.println(max);
		System.out.println(x);

	}

}
