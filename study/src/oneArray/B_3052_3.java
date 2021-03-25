package oneArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_3052_3 {

	public static void main(String[] args) {
		// Hashset이용 Hashset은 객체들ㅇ르 순서없이 저장하고 동일한 객체는 중복저장 하지 않음
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> count  = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			count.add(sc.nextInt()%42);
		}
		
		sc.close();
		
		System.out.println(count.size());

	}

}
