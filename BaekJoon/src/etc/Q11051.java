package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11051 {
		static int[][] data;
	
	public static int logic(int n, int k) {
		if(data[n][k] > 0) {
			return data[n][k];
		}
		if(k == 0 || n == k) {
			return data[n][k] = 1;
		}
		return data[n][k] = (logic(n - 1,k - 1) + logic(n - 1, k)) % 10007;
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		// 5 2
		data = new int[n + 1][k + 1];
		
		bw.write(logic(n, k) + "");
		bw.close();
	}
}
// 출처 : https://st-lab.tistory.com/162