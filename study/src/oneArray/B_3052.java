package oneArray;

import java.util.Scanner;

public class B_3052 {

	public static void main(String[] args) {
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<10; i++) {
			arr[i]=arr[i]%42;
		}
		for(int i=0; i<10; i++) {
			int cnt = 0;
			for(int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
			}
			if(cnt==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
