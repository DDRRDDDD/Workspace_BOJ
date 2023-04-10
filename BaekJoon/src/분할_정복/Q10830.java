package 분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10830 {

	private static final int MOD = 1000;
	private static int[][] map;
	private static int n;
	private static long m;

	private static int[][] multiple(int[][] o1, int[][] o2){
		int[][] tmp = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					tmp[i][j] += o1[i][k] * o2[k][j];
					tmp[i][j] %= MOD;	
				}
			}
		}
		return tmp;
	}

	private static int[][] pow(int[][] a, long m){
		if(m == 1)
			return a;

		int[][] tmp = pow(a, m/2);

		tmp = multiple(tmp, tmp);

		if(m % 2 == 1)
			tmp =multiple(tmp, a);

		return tmp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Long.parseLong(st.nextToken());
		
		map = new int[n][n];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j]= Integer.parseInt(st.nextToken()) % MOD;
			}
		}

		int[][] result = pow(map, m);

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
