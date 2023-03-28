package 동적계획법1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24416 {
	static int[] dp;

	public static int fib2(int n) {
		int cnt = 0;
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		dp[1] = dp[2] = 1;
		int result = fib2(n);
		
		System.out.println(dp[n]);
		System.out.print(result);
		

	}

}
