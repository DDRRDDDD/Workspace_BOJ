package 일차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10871 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i ++) {
			int tmp = Integer.parseInt(str.nextToken());
			if(x > tmp) {
				bw.write(tmp + " ");
			}else {
				continue;
			}
		}
		bw.close();
	}
}