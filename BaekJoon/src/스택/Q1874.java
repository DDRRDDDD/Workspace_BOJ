package 스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] stack = new int[n*2+1];
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(br.readLine());
		
		int num = 1;
		int stackIdx = 0;
		int arrIdx = 0;
		while(true) {
			if(arrIdx >= n)
				break;
			
			if(stack[stackIdx] < arr[arrIdx]) {
				sb.append("+").append("\n");
				stack[++stackIdx] = num;
				num++;
			}else if(stack[stackIdx] == arr[arrIdx]) {
				sb.append("-").append("\n");
				stack[stackIdx--] = 0;
				arrIdx++;
				
			}else {
				sb.setLength(0);
				sb.append("NO");
				break;
			}
			
		}
		System.out.println(sb);	
	}
}
