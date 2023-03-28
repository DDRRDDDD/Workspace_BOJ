package 약수_배수와소수;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		int tmp = 0;

		for(int i = 0; i < n; i++) {
			tmp = Integer.parseInt(st.nextToken());
			if(check(tmp)) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.close();
	}
	static boolean check(int tmp) {
		if(tmp == 1) {
			return false;
		}
		for(int i = 2; i < tmp; i++) {
			if(tmp % i == 0) {
				return false;
			}
		}
		return true;
	}
}