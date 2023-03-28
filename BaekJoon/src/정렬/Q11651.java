package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] cnt = new int[200001];
		int[] x = new int[n];
		int[] y = new int[n];
		String[] xy = new String[n];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
			cnt[y[i] + 100000]++;
		}
		for(int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}
		for(int i = y.length - 1; i >= 0; i--) {
			int value = y[i] + 100000;
			cnt[value]--;
			xy[cnt[value]] = String.valueOf(x[i]) + " " + String.valueOf(y[i]);
		}
		for(int i = 0 ; i < n; i++) {
			st = new StringTokenizer(xy[i]);
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		int point = y[0];
		int index = 0;
		int tmp = 0;
		out : while(true) {
			while(point == y[index]) {			
				if(index == n - 1) {
					index++;
					Arrays.sort(x, tmp, index);
					break out;
				}
				index++;
			}
			Arrays.sort(x, tmp, index);
			point = y[index]; //
			tmp = index;
		}
		for(int i = 0; i < n; i++) {
			bw.write(String.valueOf(x[i]) + " " + String.valueOf(y[i]) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
