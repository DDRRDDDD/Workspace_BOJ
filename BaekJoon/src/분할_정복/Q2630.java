package 분할_정복;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2630 {
	private static int[][] map;
	private static int n, white, blue;
	
	private static boolean check(int column, int row, int size) {
		
		int target = map[column][row];
		for(int i = column; i < column+size; i++) {
			for(int j = row; j < row+size; j++) {
				if(target != map[i][j]) {
					return false;					
				}
			}
		}
		
		return true;
	}
	
	private static void div(int column, int row, int size) {
		if(size < 1)
			return;
		
		if(check(column, row, size)) {
			if(map[column][row] == 1) 
				blue++;
			else
				white++;
		}else {
			size /= 2;
			//2사분면
			div(column, row, size);
			//1사분면
			div(column, row+size, size);
			//3사분면
			div(column+size, row, size);
			//4사분면
			div(column+size, row+size, size);			
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		div(1, 1, n);
		System.out.print(white +"\n"+ blue);
	}
}