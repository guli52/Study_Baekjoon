package study_if;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

		// ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ�
		// ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		if (score > 89) {
			System.out.println("A");
		} else if (score > 79) {
			System.out.println("B");
		} else if (score > 69) {
			System.out.println("C");
		} else if (score > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
