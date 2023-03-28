package 누적합;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25682 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] psum1 = new int[n+1][m+1];
		int[][] psum2 = new int[n+1][m+1];
		
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			for(int j = 1; j <= m; j++) {
				int tmp = str.charAt(j-1) == 'B' ? 1 : 0;
				int pivot = (i + j) % 2;
				
				int num1 = (tmp + pivot) % 2;
				int num2 = num1 == 1? 0 : 1;
				
				psum1[i][j] = num1+psum1[i-1][j]+psum1[i][j-1] - psum1[i-1][j-1];
				psum2[i][j] = num2+psum2[i-1][j]+psum2[i][j-1] - psum2[i-1][j-1];
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= n-k; i++) {
			for(int j = 0; j <= m-k; j++) {
				int ii = i+k;
				int jj = j+k;
				
				int result1 = psum1[ii][jj] - psum1[i][jj] - psum1[ii][j] + psum1[i][j];
				int result2 = psum2[ii][jj] - psum2[i][jj] - psum2[ii][j] + psum2[i][j];
				
				min = Math.min(Math.min(min, result1), result2);
			}
		}
		System.out.print(min);
	}

}
