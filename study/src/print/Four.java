package print;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B= sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);

	}

}
