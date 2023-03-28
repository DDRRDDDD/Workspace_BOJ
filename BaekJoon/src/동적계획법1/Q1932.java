package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1932 {
	static int[][] arr;
	static int[][] dp;
	static int n;
	
	public static int logic(int i, int j) {
		if(i == n-1)
			return arr[i][j];
		
		if(dp[i][j] == -1)
			dp[i][j] = Math.max(logic(i+1, j), logic(i+1, j+1)) + arr[i][j];
		
		return dp[i][j];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		dp = new int[n][n];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		
		bw.write(String.format("%d",logic(0, 0)));
		bw.flush();
		bw.close();
	
	}
}
