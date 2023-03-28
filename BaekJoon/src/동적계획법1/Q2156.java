package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		int[] dp = new int[10001];
		
		for(int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
		}
		
		bw.write("\n");
		for(int i = 1; i <= n; i++) {
			bw.write(dp[i] + " ");
		}
		bw.close();
	}

}
