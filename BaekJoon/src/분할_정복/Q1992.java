package 분할_정복;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992 {
	private static int[][] map;
	private static int n;
	
	public static boolean check(int column, int row, int size) {
		int target = map[column][row];
		for(int i = column; i < column+size; i++) {
			for(int j = row; j < row+size; j++) {
				if(target != map[i][j])
					return false;
			}
		}
		return true;
	}
	
	public static String div(int column, int row, int size) {
		String str = "";
		if(size < 1)
			return str;
		
		if(check(column, row, size)) {
			if(map[column][row] == 1) {
				str += "1";
			}else {
				str += "0";
			}
		}else {
			str = "(";
			size /= 2;
			str += div(column, row, size);
			str += div(column, row+size, size);
			str += div(column+size, row, size);
			str += div(column+size, row+size, size);
			str += ")";
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			for(int j = 1; j <= n; j++) {
				map[i][j] = str.charAt(j-1) - '0';
			}
		}
		System.out.println(div(1, 1, n));
	}
}
