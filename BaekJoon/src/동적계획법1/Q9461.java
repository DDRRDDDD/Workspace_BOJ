package 동적계획법1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9461 {
	
	public static long logic(int n) {
		long[] arr = new long[n + 1];
		
		if(n <= 5) {
			if(n > 3)
				return 2;
			
			return 1;
		}else {
			arr[1] = arr[2] = arr[3] = 1;
			arr[4] = arr[5] = 2;
			for(int i = 6; i <= n; i++){
				arr[i] = arr[i - 5] + arr[i - 1];
			}
		}
		return arr[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++)
			sb.append(logic(Integer.parseInt(br.readLine()))).append("\n");
		
		System.out.print(sb);
	}

}
