package 브루트포스;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1436R {

	static final String six = "666";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		long num = 666;
		long result = 0;

		while(cnt < n) {
			if(String.valueOf(num).contains(six)) {
				cnt++;
				result = num;
			}
			num++;
		}
		bw.write(result + "");
		bw.close();
	}
}
