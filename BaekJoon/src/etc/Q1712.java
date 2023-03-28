package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long fc = Integer.parseInt(st.nextToken());
		int pc = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		if(pc >= price) {
			bw.write(-1 + "");
		}else {
			cnt = (int)(fc / (price - pc)) + 1 ;
			bw.write(cnt + "");
			}
		bw.close();
		}
	}