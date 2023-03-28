package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		
		for(int i = 2; i*i <= 1000000; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= 1000000; j += i) {
					prime[j] = true;
				}
			}
		}
		
		for(int a = 0; a < t; a++) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			for(int i = 2; i <= n/2; i++) {
				int num1 = i;
				int num2 = n-i;
				if(!prime[num1] && !prime[num2])
					cnt++;
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}

}
