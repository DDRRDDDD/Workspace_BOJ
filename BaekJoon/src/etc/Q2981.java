package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2981 {
	public static int logic(int a, int b) {
		
		while(b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int value = arr[1] - arr[0];
		
		for(int i = 2; i < n; i++) {
			value = logic(value, arr[i] - arr[i-1]);
		}
		
		for(int i = 2; i <= value; i++) {
			if(value % i == 0) {
				bw.write(i + " ");
			}
		}
		bw.close();
	}

}

// 출처 : https://st-lab.tistory.com/155