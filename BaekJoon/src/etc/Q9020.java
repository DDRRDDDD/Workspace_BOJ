package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9020 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		int min =0;
		int max =0;
		
		boolean[] prime = new boolean[10001];
		for(int i = 2; i * i <= prime.length; i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		prime[0] = prime[1] = true;
		
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			for(int j = 2; j <= num / 2; j++) {
				if(!prime[j] && !prime[num - j]) {
					min = j;
					max = num - j;
				}
			}
			bw.write(min + " " + max + "\n");
		}
		bw.close();
	}

}