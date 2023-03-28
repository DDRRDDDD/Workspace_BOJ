package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = 0;

		boolean[] prime = new boolean[246913];

		for(int i = 2; i * i <= prime.length; i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		prime[0] = prime[1] = true;

		while(true) {
			int cnt = 0;
			num = Integer.parseInt(br.readLine());
			if(num == 0) {
				break;
			}
			for(int i = num + 1; i <= num * 2; i++) {
				if(!prime[i]) {
					cnt++;
				}
			}
			bw.write(cnt + "\n");
		}
		bw.close();
	}
}