package oneArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_8958_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> str = new ArrayList<String>();
		
		//입력받은 OX를 List에 저장
		for(int i=0; i<n; i++) {
			str.add(sc.next());
		}
		sc.close();
		
		//점수계산
		for(int i=0; i<n; i++) {
			int count = 0;
			int sum = 0;
			for(int j=0; j<str.get(i).length(); j++) {
				if(str.get(i).charAt(j)=='O') {
					count++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}

	}

}
