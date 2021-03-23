package study_for;

import java.io.*;
import java.util.StringTokenizer;

public class For4 {

	public static void main(String[] args) throws Exception {
		// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와BufferedWriter를 사용할 수 있다.
		// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		// 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

		// Reader와 Writer를 선언
		// 각각 InputStreamReader와 OutputStreamWriter를 통해 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// read로 입력받은 데이터를 가공하기 위한 Tokenizer 선언
		// BufferedReader로 입력한 값은 전부 String으로 리턴되므로 토큰화하여 가공해야함
		//StringTokenizer st;

		// readLine() = 한 줄을 읽고 String으로 반환
		// String s = br.readLine(); //스트링일경우

		// String값이 리턴되므로 필요한 형태로 형변환 해줘야한다.
		int T = Integer.parseInt(br.readLine()); // int일 경우

		for (int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
	
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			int result = A + B;

			bw.write(result + "\n");  //출력

		}

		bw.flush();  //남아있는 데이터 모두 출력, 스트림 비우기
		//bw.close;  //스트림닫기

	}

}
