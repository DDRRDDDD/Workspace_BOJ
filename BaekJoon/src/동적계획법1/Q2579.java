package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2579 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		
		
		for(int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			if(i > 2)
				break;
			dp[i] = arr[i] + dp[i - 1];
		}
		
		if(n > 2) {
			for(int i = 3; i <= n; i++)
				dp[i] = Math.max(dp[i-2],dp[i-3] + arr[i-1]) + arr[i];			
		}
		bw.write(String.format("%d", dp[n]));
		bw.close();
	}
}
