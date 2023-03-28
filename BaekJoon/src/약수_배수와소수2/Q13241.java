package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a1 = Long.parseLong(st.nextToken());
		long a2 = Long.parseLong(st.nextToken());
		
		long b = a1 >= a2 ? a1 : a2;
		long s = b == a1 ? a2 : a1;
		
		long mod = 0;
		while(true) {
			long tmp = s;
			s = b % s;
			b = tmp;
			
			if(s == 0) {
				mod = b;
				break;
			}
		}
		System.out.println(a1 * a2 / mod);
	}

}
