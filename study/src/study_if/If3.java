package study_if;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		/*
		 ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� ��
		 �Ǵ� 400�� ����� ���̴�. ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰�
		 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
		 */
		
		//ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
		//ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		long year = sc.nextInt();
		long a = year % 4;
		long b = year % 100;
		long c = year % 400;
		
		if(a == 0 && b != 0 || c == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
