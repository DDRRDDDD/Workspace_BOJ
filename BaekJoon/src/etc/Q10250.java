package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int h = 0;
		int w = 0;
		int guest = 0;
		int cnt = 0;
		int a = 0;
		int b = 0;

		for(int i = 0; i < n; i++) {	
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			guest = Integer.parseInt(st.nextToken());
			x : for(a = 1; a <= w; a++) {
				for(b = 1; b <= h; b++) {
					cnt++;
					if(cnt == guest) {
						break x ;
					}
				}
			}
			cnt = 0;
			if(a > 9) {
				bw.write(b + "" + a + "\n");
			}else
			bw.write(b + "0" + a + "\n");
		}
		bw.close();
	}
}
