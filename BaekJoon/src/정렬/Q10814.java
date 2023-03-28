package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] age = new int[n];
		int[] cnt = new int[201];
		String[] name = new String[n];
		String[] result = new String[n];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			age[i] = Integer.parseInt(st.nextToken());
			name[i] = st.nextToken();
			cnt[age[i]]++;
		}
		for(int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}
		for(int i = result.length - 1; i >= 0; i--) {
			int value = age[i];
			result[--cnt[value]] = String.valueOf(value) + " " + name[i];
		}
		for(int i = 0; i < n; i++) {
			bw.write(result[i] + "\n");
		}
		bw.close();
	}
}