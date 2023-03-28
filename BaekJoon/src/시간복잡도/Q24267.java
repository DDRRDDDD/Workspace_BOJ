package 시간복잡도;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println(n*(n-1)*(n-2) /6 + "\n3");
	}

}
