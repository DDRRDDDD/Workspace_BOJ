package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());		

		int dot = 2;
		int point = 1;
		for(int i = 1; i <= n; i++) {
			dot += point;
			point *= 2;
		}

		System.out.println(dot * dot);
	}
}
