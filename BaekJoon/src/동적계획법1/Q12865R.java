package 동적계획법1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12865R {
	
	static int[] dp;
	static boolean[] check;
	static  StringBuilder sb = new StringBuilder();
	static int n, k;
	static int[][] matrix = {
			{0, 0},
			{6,13},
			{4, 8},
			{3, 6},
			{5,12}}; 
	static int max = Integer.MIN_VALUE;
	
	public static void logic(int index, int depth, int m) {
		if(index == m) {
			int totalW = 0;
			int totalV = 0;
			for(int i = 0; i < m; i++) {
				totalW += matrix[dp[i]][0];
				totalV += matrix[dp[i]][1];
			}
			if(totalW <= k)
				max = Math.max(max, totalV);	
		}
			

		for(int i = depth; i <= n; i++) {
			if(!check[i]) {
				dp[index] = i;
				check[i] = true;
				logic(index+1 , i+1 ,m);
				check[i] = false;			
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		dp = new int[n+1];
		check = new boolean[n+1];
		
		for(int i = 1; i <= 4; i++)
			logic(0, 1, i);
		
		System.out.print(max);
		
		
	}

}
