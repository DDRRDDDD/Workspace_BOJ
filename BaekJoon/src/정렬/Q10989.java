package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001];
		
		for(int i = 0; i < n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		for(int i =1; i < cnt.length; i++) {
			while(cnt[i] > 0) {
				bw.write(i + "\n");
				cnt[i]--;
			}
		}
		bw.close();
	}
}
