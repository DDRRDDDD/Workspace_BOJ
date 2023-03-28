package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929 {

		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int j = 0;
		
		boolean[] arr = new boolean[b + 1];
		
		
		for(int i = 2; i * i <= arr.length; i++) {
			j = i * i;
			while(j < arr.length) {
				arr[j] = true;
				j += i;
			}
		}
		arr[0] = arr[1] = true;
		
		for(int i = a; i <= b; i++) {
			if(!arr[i]) {
				bw.write(i + "\n");
			}
		}
		bw.close();
	}
}
