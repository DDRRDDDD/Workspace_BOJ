package 누적합;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr[i][j] = num + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st.nextToken()) - 1;
			int b1 = Integer.parseInt(st.nextToken()) - 1;
			int a2 = Integer.parseInt(st.nextToken());
			int b2 = Integer.parseInt(st.nextToken());
			
			int result = arr[a2][b2] - arr[a1][b2] - arr[a2][b1] + arr[a1][b1];
			sb.append(result).append("\n");
		}
		System.out.println(sb);
		System.out.println();
		System.out.println(sb2);
	}

}
