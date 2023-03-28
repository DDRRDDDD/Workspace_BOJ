package 심화1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		
		for(int i = 1; i <= n; i++)
			arr[i] = i;
 		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int mid = Integer.parseInt(st.nextToken());
			
			int[] tmp = new int[end - start + 1];
			int index = 0;
			
			for(int j = mid; j <= end; j++)
				tmp[index++] = arr[j];
			for(int j = start; j < mid; j++)
				tmp[index++] = arr[j];
			
			index = 0;
			for(int j = start; j <= end; j++) {
				arr[j] = tmp[index++];
			}
		}
		for(int i = 1; i <= n; i++)
			System.out.print(arr[i] + " ");
	}

}
