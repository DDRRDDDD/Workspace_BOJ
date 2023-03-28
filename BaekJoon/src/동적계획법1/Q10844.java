package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10844 {
	
	static final long NUMBER = 1_000_000_000L;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[101][10];
		
		for(int i = 0; i < 10; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i][0] = dp[i - 1][1] % NUMBER;
			
			for(int j = 1; j < 9; j++)
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % NUMBER;
			
			dp[i][9] = dp[i - 1][8] % NUMBER;
		}
		
		
		long result = 0;
		for(int i = 1; i < 10; i++) {
			result += dp[n][i]; 
		}
		bw.write(String.format("%d", result % NUMBER));
		bw.close();
	}

}
