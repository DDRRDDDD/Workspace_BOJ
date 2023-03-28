package 백트래킹;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14888{
	static StringBuilder sb;
	static int n , m;
	static int[][] arr;
	//결과 출력용
	static int[] dp;
	static boolean[] check;

	static int tmp;
	static int min = Integer.MAX_VALUE;

	public static void logic2(int index) {
		if(index == 2) {
			tmp += arr[dp[0]][dp[1]];
			return;
		}

		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				dp[index] = i;
				check[i] = true;
				logic2(index + 1);
				check[i] = false;
			}
		}

	}

	public static void logic1(int index, int depth) {
//		if(index == m) {
//			int sum = 0;
//			// 두번 반복
//			for(int k = 0; k < 2; k++) {
//				logic2(0);
//				for(int i = 1; i <= n; i++) {
//					check[i] = !check[i];
//				}
//				
//				if(k == 0) {
//					sum = tmp;
//					tmp = 0;
//					continue;
//				}
//				sum = Math.abs(sum  - tmp);
//				tmp = 0;
//			}
//			min = Math.min(min, sum);
//			return;
//		}
		
		if(index == m) {
			int sum = 0;
			
			for(int i = 0; i < 2; i++) {
				logic2(0);
				switch(i) {
				case 1 :
					sum = Math.abs(sum - tmp);
					min = Math.min(min, sum);
				case 0 :
					sum = tmp;
					tmp = 0;
				}
				for(int j = 1; j <= n; j++) {
					check[j] = !check[j];
				}
			}
			return;
		}

		for(int i = depth; i <= n; i++) {
			if(!check[i]) {
				check[i] = true;
				logic1(index + 1, i + 1);
				check[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = n / 2;
		arr = new int[n + 1][n + 1];
		dp = new int[m];
		check = new boolean[n + 1];

		StringTokenizer st;
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// depth 가 2 이면 1을 제외한 경우의 수가 출력
		logic1(0, 2);
		System.out.print(min);
	}
}