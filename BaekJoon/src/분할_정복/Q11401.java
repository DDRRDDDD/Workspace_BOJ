package 분할_정복;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11401 {
	
	private static final long MOD = 1000000007;
	
	private static long div(long num, long part) {
		if(part == 1)
			return num % MOD;
		
		long tmp = div(num, part/2);
		
		if(part % 2 == 1)
			return (tmp*tmp%MOD) * num%MOD;
			
		return(tmp*tmp%MOD);
	}
	
	private static long factorial(long n) {
		long num = 1L;
		for(long i = 2; i <= n; i++) {
			num = num * i % MOD;
		}
		return num;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Integer.parseInt(st.nextToken());
		long k = Integer.parseInt(st.nextToken());
		
		long child = factorial(n); // n!		
		long mom = factorial(k) * factorial(n-k) % MOD;
		
		System.out.println(child * div(mom, MOD-2) % MOD);
	}

}
//이항계수
//1 ≤ N ≤ 4,000,000
//0 ≤ K ≤ N
// n! / k!(n-k)!
// (n! % MOD) X ((n!(n-k)!)^MOD-2 % MOD) % MOD ;;;;