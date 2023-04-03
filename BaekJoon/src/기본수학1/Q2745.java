package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String b = st.nextToken();
		int n = Integer.parseInt(st.nextToken());

		int result = 0;
		for(int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			int number = 'A' <= ch && ch <= 'Z' ? ch - '7' : ch - '0';
			result = result*n + number;
			System.out.println(result);
		}
		System.out.println(result);
	}
}

