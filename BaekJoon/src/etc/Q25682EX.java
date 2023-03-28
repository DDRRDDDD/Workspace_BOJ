package etc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25682EX {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] arr1 = new int[n+1][m+1];
		int[][] arr2 = new int[n+1][m+1];
		
		// 체스판은 시작점이 흑으로 시작하는지 백으로 시작하는지 둘로 나뉜다
		// 그러므로 케이스도 두개를 적용 해야한다
		int[][] psum1 = new int[n+1][m+1];
		int[][] psum2 = new int[n+1][m+1];


		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			for(int j = 1; j <= m; j++) {
				int wb = str.charAt(j-1) == 'B' ? 0 : 1;
				
				int pivot = (i+j) % 2;
				
				int num1 = (wb+pivot) % 2;
				int num2 = num1 % 2 == 0 ? 1 : 0;

				arr1[i][j] = num1;
				arr2[i][j] = num2;

				psum1[i][j] = num1 + psum1[i-1][j] + psum1[i][j-1] - psum1[i-1][j-1];
				psum2[i][j] = num2 + psum2[i-1][j] + psum2[i][j-1] - psum2[i-1][j-1]; 
			}
		}
		
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= n-k; i++) {
			for(int j = 0; j <= m-k; j++) {
				int ii = k+i;
				int jj = k+j;
				int result1 = psum1[ii][jj] - psum1[i][jj] - psum1[ii][j] + psum1[i][j];   
				int result2 = psum2[ii][jj] - psum2[i][jj] - psum2[ii][j] + psum2[i][j];
				min = Math.min(Math.min(min, result1), result2);
				cnt++;
				System.out.println(cnt + "번째");
				System.out.println("result1 :" + result1);
				System.out.println("result2 :" + result2);
			}
		}
		
		System.out.println("case1");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("case2");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("psum1");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				int tmp = psum1[i][j];
				if(tmp < 10)
					System.out.print(tmp + "  ");
				else
					System.out.print(tmp + " ");
			}
			System.out.println();
		}

		System.out.println("psum2");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				int tmp = psum2[i][j];
				if(tmp < 10)
					System.out.print(tmp + "  ");
				else
					System.out.print(tmp + " ");
			}
			System.out.println();
		}
		
		System.out.println("cnt : " + cnt);
		System.out.println("min : " + min);
	}
}
