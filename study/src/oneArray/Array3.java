package oneArray;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성 
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 sc.close();
		 
		 int t = a*b*c;
		 int[] arr = new int[10];	//{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}로 초기화 되어있음 
		 
		 while(t!=0) {
			 arr[t%10]++;	//10을 나눈 나머지값 => 현재 배열 위치 , 나머지값에 해당하는 위치의 값 +1
			 t /= 10;
		 }
		 
		 for(int i=0; i<10; i++) {
			 System.out.println(arr[i]);
		 }

	}

}
