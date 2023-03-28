package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11054 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];
		
		
		int max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp1[i] = 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j])
					dp1[i] = Math.max(dp1[i], dp1[j] + 1);
			}
			max = Math.max(max, dp1[i]);
		}
		
		for(int i = n-1; i >= 0; i--) {
			dp2[i] = 1;
			for(int j = n-1; j > i; j--) {
				if(arr[i] > arr[j])
					dp2[i] = Math.max(dp2[i], dp2[j] + 1);
			}
			max = Math.max(max, dp1[i] + dp2[i]);
		}
		
		bw.write((max-1) + "");
		bw.close();
	}

}
