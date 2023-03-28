package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long n = Long.parseLong(br.readLine());
		
		for(long i = 0; i < n; i++) {
			
			long num = Long.parseLong(br.readLine());
			if(num < 2)
				num = 2;
			main:while(true) {
				for(long j = 2; j*j <= num; j++) {
					if(num % j == 0) {
						num++;
						continue main;						
					}
				}
				sb.append(num).append("\n");
				break;
			}
		}
		System.out.println(sb);

	}

}
