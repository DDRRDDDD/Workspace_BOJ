package 재귀;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q25501 {

	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String s;
		for(int i = 0; i < n; i++) {
			cnt = 0;
			s = br.readLine();
			int result = input(s, 0, s.length() - 1);
			 bw.write(result + " " + cnt + "\n");
		}
		bw.close();
	}
	public static int input(String str, int left, int right) {
		cnt++;
		
		if(left >= right) {
			return 1;
		}else if(str.charAt(left) != str.charAt(right)) {
			return 0;
		}
		else {
			return input(str, left + 1, right - 1);
		}
	}
}