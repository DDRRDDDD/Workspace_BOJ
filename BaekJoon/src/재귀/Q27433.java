package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27433 {

	public static long logic(int n) {
		if(n == 0)
			return 1;
		
		return logic(n-1) * n;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(logic(n));
	}

}
