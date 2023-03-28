package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2485 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		int num = Integer.parseInt(br.readLine());
		for(int i = 1; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			arr[i] = Math.abs(tmp - num);
			num = tmp;
		}
		
		int result = 0;
		int big = Math.max(arr[1],arr[2]);
		int small = Math.min(arr[1], arr[2]);
		while(true) {
			int tmp = small;
			small = big % small;
			big = tmp;
			
			if(small == 0) {
				result = big;
				break;
			}
		}

		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum += arr[i] / result;
		}
		System.out.println(sum-(n-1));
		
	}

}
