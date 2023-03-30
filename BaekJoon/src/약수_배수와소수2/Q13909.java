package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13909 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int pos = 0;
		for(int i = 1; i <= n; i++) {
			cnt++;
			pos += 2;
			i += pos;
		}
		System.out.println(cnt);
		
	}
}
