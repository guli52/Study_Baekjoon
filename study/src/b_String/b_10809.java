package b_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10809 {

	public static void main(String[] args) throws IOException {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine(); 
		
		//char타입도 정수 타입이므로 산술 연산이 가능함
//		for(char c='a'; c<='z'; c++) {	//indexOf() 이용
//			System.out.print(word.indexOf(c) + " ");
//		}
		
		
		int[] intArray = new int[26];
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = -1;
		}
		
		for(int i=0; i<word.length(); i++) {
			if(intArray[word.charAt(i)-'a']==-1) {
				intArray[word.charAt(i)-'a']=i;
			}
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	} 
}
