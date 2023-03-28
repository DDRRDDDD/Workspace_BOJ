package 심화1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2444 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
				
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				sb.append(" ");
			}
			for(int j = n-i; j < n+i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
			
		}
		for(int i = n-2; i >= 0; i--) {
			for(int j = n-i-2; j >= 0; j--) {
				sb.append(" ");
			}
			for(int j = n+i; j >= n-i; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		sb = new StringBuilder();
		
		
		// 참조
		for(int i = 0; i <2*n-1; i++) {
			int line = Math.abs(n-i-1);
			for(int j = 0; j <line; j++)
				sb.append(" ");
			for(int j = 0; j < (n-line)*2-1; j++)
				sb.append("*");
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
