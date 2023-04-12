package 분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11444 {
	
	private static final int MOD = 1000000007;
	private static long n;
	private static long[][] matrix;

	public static long[][] multiple(long[][] o1, long[][] o2){
		long[][] tmp = new long[2][2];

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 2; k++) {
					tmp[i][j] += o1[i][k] * o2[k][j];
					tmp[i][j] %= MOD;	
				}
			}
		}
		return tmp;
	}
	
	public static long[][] div(long[][] a, long n){
		if(n == 1)
			return a;
		
		long[][] tmp = div(a, n/2);
		tmp = multiple(tmp, tmp);
		
		if(n % 2 == 1)
			tmp =multiple(tmp, a);

		return tmp;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Long.parseLong(br.readLine());
		
		matrix = new long[][]{{1, 1},{1, 0}};
		long[][] another = {{1,0},{0, 1}};
		
		if(n < 3)
			System.out.println(1);
		else {
			long[][] tmp = multiple(div(matrix,n),another);
			System.out.println(Math.abs(-tmp[1][0]));			
		}
	}

}
