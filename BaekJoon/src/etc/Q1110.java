package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int fn = Integer.parseInt(br.readLine());
		int n = fn;
		int cnt = 0;
		int d = 0;
		int td = 0;
		while(true) {
			if(n < 10) {
				td = n;
				n = (td * 10) + td;
			}else {
				d = (n / 10);
				td = (n % 10);
				n = (td * 10) + ((d + td) % 10);
			}

			if(n == fn) {
				cnt += 1;
				break;
			}else {
				cnt += 1;
			}
		}
		bw.write(cnt + "");
		br.close();
		bw.close();
	}
}
