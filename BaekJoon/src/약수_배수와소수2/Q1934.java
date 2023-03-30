package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1934 {
	public static int logic(int num1, int num2) {
		int a = num1;
		int b = num2;
		
		while(a != b) {
			if(a > b)
				b += num2;
			else
				a += num1;
		}
		return a;
	}


	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());			
			bw.write(logic(a, b) + "\n");
		}
		bw.close();
	}
}