package 분할_정복;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1780 {
	
	private static int map[][];
	private static int n;
	private static int numNegOne, numZero, numOne; 
	
	private static boolean check(int column, int row, int size) {
		int target = map[column][row];
		for(int i = column; i < column+size; i++) {
			for(int j = row; j < row+size; j++) {
				if(target != map[i][j])
					return false;
			}
		}
		return true;
	}
	
	private static void div(int column, int row, int size) {
		if(size < 0)
			return;
		
		if(check(column, row, size)) {
			int num = map[column][row];
			if(num < 0)
				numNegOne++;
			else if(num > 0)
				numOne++;
			else
				numZero++;
		}else {
			// 아홉번 분할
			size /= 3;
			for(int i = 0; i < 3; i++) {
				int y = column + (size*i);
				for(int j = 0; j < 3; j++) {
					int x = row + (size*j);
					div(y, x, size);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		numNegOne = 0;
		numZero = 0;
		numOne = 0;
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		div(1, 1, n);
		System.out.print(numNegOne +"\n"+ numZero +"\n"+ numOne);
	}

}
//2187