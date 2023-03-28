package 시간복잡도;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24265 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long sum = 0;
		for(int i = 1; i <= n-1; i++)
			sum += i;
		
		System.out.println(sum +"\n2");
	}

}
