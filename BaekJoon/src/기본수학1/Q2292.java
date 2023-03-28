package 기본수학1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new	BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int sixx = 1;
		int cnt = 1;
		
		while(true) {	
			if(num <= sixx) {
				bw.write(cnt + "");
				break;
			}						
			sixx += 6 * cnt;  
			cnt++;			  
		}
		bw.close();
	}
}