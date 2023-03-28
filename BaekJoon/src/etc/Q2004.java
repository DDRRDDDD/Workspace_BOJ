package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2004 {
	public static int five(long num) {
		int cnt = 0;
		
		while(num >= 5) {
			cnt += num / 5;
			num /= 5;
		}
		return cnt;
	}
	public static int two(long num) {
		int cnt = 0;
		
		while(num >= 2) {
			cnt += num / 2;
			num /= 2;
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long fiveNum = five(a) - five(a - b) - five(b);
		long twoNum = two(a) -two(a - b) - two(b);
		
		long result = (fiveNum <= twoNum) ? fiveNum : twoNum;
		
		bw.write(fiveNum+ "");
		bw.write(twoNum+ "");
		bw.write(result+ "");
		bw.close();
		
	}

}
// 출처 : https://st-lab.tistory.com/166
