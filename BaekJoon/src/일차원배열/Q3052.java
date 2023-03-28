package 일차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = 0;
		int cnt = 0;
		boolean contains;

		ArrayList<Integer> arr = new ArrayList<>(); 

		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()) % 42;
			contains = arr.contains(n);
			if(!contains) {
				cnt++;
			}
			arr.add(i, n);
		}
		bw.write(cnt + "");
		bw.close();
	}
}