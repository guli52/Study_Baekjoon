package b_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1152 {
	public static void main(String[] args) throws IOException {
		/******************************************************
		 	영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 
		  	이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
		  	단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		  ******************************************************/
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word= br.readLine();
		StringTokenizer st = new StringTokenizer(word, " ");
		
		System.out.println(st.countTokens());
		*/
		
		int count = 0;
		int pre_str = 32;	// 공백 의미(공백 아스키코드=32) int pre_str=' '도 가능, 이전문자
		int str ;			// 현재 문자
		
		
		while(true) {
			str = System.in.read();	//원시 입력 형태
			
			// 입력받은 문자가 공백일 때, 
			if(str == 32) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
			}
 
			// 입력받은 문자가 개행일때 ('\n')
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
				break;
			}
			
			pre_str = str;
			
		}
		
		System.out.println(count);
	}

}
