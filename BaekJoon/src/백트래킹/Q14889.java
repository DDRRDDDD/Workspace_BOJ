package 백트래킹;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14889 {
	static int n, m, tmp;
	static int[][] arr;
	static int[] tmpArr;
	static boolean[] check;
	
	static int min = Integer.MAX_VALUE;

	public static void logic2(int index) {
		if(index == 2) {
			tmp += arr[tmpArr[0]][tmpArr[1]];
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				tmpArr[index] = i;
				check[i] = true;
				logic2(index + 1);
				check[i] = false;
			}
		}
	}
	
	public static void logic1(int index, int depth) {
		if(index == m) {
			int sum = 0;
			
			for(int i = 0; i < 2; i++) {
				logic2(0);
				for(int j = 0; j <= n; j++) {
					check[j] = !check[j];
				}
				
				if(i == 0) {
					sum = tmp;
					tmp = 0;
					continue;
				}
				
				sum = Math.abs(sum - tmp);
				tmp = 0;
			}
			
			min = Math.min(min, sum);
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
		check = new boolean[n + 1];
		tmpArr = new int[m];
		
		StringTokenizer st;
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		logic1(0, 2);
		System.out.println(min);
	}

}
