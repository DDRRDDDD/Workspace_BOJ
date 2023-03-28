package 누적합;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] sumArr = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		
		
		for(int i = 1; i <= n; i++)
			sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken()); 
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			int result = sumArr[end] - sumArr[start - 1];
			sb.append(result).append("\n");
		}
		System.out.println(sb);
		
	}

}
