package 백트래킹;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15651 {
	
	static int num1, num2;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void logic(int index) {
		if(index == num2) {
			for(int i = 0; i < num2; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		}else {
			for(int i = 1; i <= num1; i++) {
				arr[index] = i;
				logic(index + 1);
			}						
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		num1 = Integer.parseInt(st.nextToken());
		num2 = Integer.parseInt(st.nextToken());
		
		arr = new int[num1 + 1];
		
		logic(0);
		System.out.print(sb);
		
 	}

}