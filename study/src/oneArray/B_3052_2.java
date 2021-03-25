package oneArray;

import java.util.Scanner;

public class B_3052_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2 = new int[42];
		int count=0;
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<10; i++) {
			arr2[arr[i]%42]++;
		}
		for(int i=0; i<42; i++) {
			if(arr2[i]!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
