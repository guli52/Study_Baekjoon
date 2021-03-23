package study_if;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		//첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
		//점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		// -.+ => 2사분면 / +,+ => 1사분면 / -,- => 3사분면 / +,- => 4사분면
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x < 0 && y > 0) {
			System.out.println("2");
		}else if (x > 0 && y > 0) {
			System.out.println("1");
		}else if (x < 0 && y < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}

	}

}
