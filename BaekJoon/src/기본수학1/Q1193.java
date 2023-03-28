package 기본수학1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		int inc = 0;
		
		while(cnt < num) {
			inc++;
			cnt = inc * (inc + 1) / 2;
//			bw.write(inc + " " + cnt + "\n");
		}
		int tmp = cnt - num;
		
		if((inc % 2) == 0) { // inc가 짝 수 
			bw.write((inc - tmp) + "/" + (1 + tmp));
		}else if ((inc % 2) == 1) {  // inc가 홀 수
			bw.write((1 + tmp) + "/" + (inc - tmp) );
		}
		bw.close();
	}
}
