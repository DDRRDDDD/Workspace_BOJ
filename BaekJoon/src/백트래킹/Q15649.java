package 백트래킹;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q15649 {
	
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] check;
	
	static int n, m;
	
	public static void logic(int index) {
		if(index == m) {
			for(int i = 0; i < m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		}
		
		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				arr[index] = i;
				check[i] = true;
				logic(index + 1);
				check[i] = false;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[9];
		check = new boolean[9];
		logic(0);
		
		System.out.print(sb);
 	}
}
