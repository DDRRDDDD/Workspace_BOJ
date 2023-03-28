package 약수_배수와소수;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				num = num / i;
				bw.write(i + "\n");
				i = 1;
			}
		}
		bw.close();
	}
}
