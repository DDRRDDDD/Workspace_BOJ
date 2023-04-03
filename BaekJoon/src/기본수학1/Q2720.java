package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = {25, 10, 5, 1};
		
		int n = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < n; a++) {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < arr.length; i++){
				sb.append(num/arr[i]).append(" ");
				num %= arr[i];
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}