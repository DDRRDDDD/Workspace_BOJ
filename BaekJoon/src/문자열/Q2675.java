package 문자열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Q2675 {
	static BufferedReader  br;
	static BufferedWriter  bw;
	static StringTokenizer st;
	static int n, r;
	static String str;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			input();
			output();
		}
		bw.close();
	}
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		str = st.nextToken();
	}
	static void output() throws IOException {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < r; j++) {
				result += str.charAt(i) + "";
			}
		}
		bw.write(result +"\n");
	}
}
