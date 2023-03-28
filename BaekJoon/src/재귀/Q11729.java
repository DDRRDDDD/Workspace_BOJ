package 재귀;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11729 {
	static StringBuffer sb;
	
	public static void logic(int a, int b, int c, int n) {
		if(n == 1) {
			sb.append(a).append(" ").append(c + "\n");
			return;
		}
		logic(a, c, b, n - 1);
		sb.append(a).append(" ").append(c + "\n");
		logic(b, a, c, n - 1);
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuffer();
		
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write((int)Math.pow(2, n) - 1 + "\n"); // 횟수
		logic(1, 2, 3, n);
		bw.write(sb + "");
		bw.close();
	}

}