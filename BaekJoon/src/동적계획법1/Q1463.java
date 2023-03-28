package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		dp[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			int a = Integer.MAX_VALUE;
			int b = Integer.MAX_VALUE;
			
			if(i % 2 == 0)
				a = dp[i/2] + 1;
			
			if(i % 3 == 0)
				b = dp[i/3] + 1;
			
			int c = dp[i-1] + 1;
			
			dp[i] = Math.min(Math.min(a,b),c);
		}
		
		bw.write(String.format("%d", dp[n]));
		bw.close();
	}

}
