package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q4134R {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			BigInteger value = new BigInteger(br.readLine()); 
			if(value.isProbablePrime(10))
				sb.append(value).append("\n");
			else
				sb.append(value.nextProbablePrime()).append("\n");
		}
		System.out.print(sb);
	}

}
