package oneArray;

import java.util.Scanner;

public class B_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		
		//OX입력받기
		for(int i=0; i<n; i++) {
			str[i] = sc.next();	// \n을 무시하기 위해 next()사용   next()공백또는 엔터를 구분점으로 판단     nexLin() 공백도 문자열로 판단 ==> 엔터값도 받게됨
		}
		sc.close();
		
		//점수계산
		for(int i=0; i<str.length; i++) {
			int count = 0;	//연속으로 O가 나온 개수
			int sum = 0;	//count의 합
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j)=='O') {
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
