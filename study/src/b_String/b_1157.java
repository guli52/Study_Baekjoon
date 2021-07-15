package b_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1157 {

	public static void main(String[] args) throws IOException {
		//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		//가장 많이 사용된 알파벳을 대문자로 출력한다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String org = br.readLine();
		String up = org.toUpperCase();
		
		int[] arr = new int[26]; 
		
		int max = -1;	//0을 안쓴 이유 : 예외가 발생하지 않는 안전한 숫자이면 괜찮지만 관행상 음수로 많이 표기한다고 함
		char ch = '?';
	
		for(int i=0; i<up.length(); i++) {
			arr[up.charAt(i)-'A']++;
			if(max<arr[up.charAt(i)-'A']) {
				max = arr[up.charAt(i)-'A'];
				ch = up.charAt(i);
			} else if(max==arr[up.charAt(i)-'A']) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}

}
