package 누적합;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2559 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];

		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++)
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());

		int max = Integer.MIN_VALUE;
		for(int i = m; i <= n; i++) {
			int result = arr[i] - arr[i - m];
			max = Math.max(max, result);
		}

		System.out.println(max);
	}

}
