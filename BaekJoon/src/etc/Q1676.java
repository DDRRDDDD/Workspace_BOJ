package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i = 5; i <= n; i += 5) {
			int num = i;
			while(num % 5 == 0) {
				num /= 5;
				cnt++;
			}
		}
		bw.write(cnt + "\n");
//		cnt = 0;
//		while(n >= 5) {
//			cnt += n / 5;
//			n /= 5;
//		}
//		
//		bw.write(cnt + "\n");
		bw.close();
	}
}
