package 반복문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str; 
		int cnt = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < cnt; i++) {
			str = new StringTokenizer(bf.readLine());
			bw.write(
					Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()) + "\n"
					);
		}
		bw.close();
	}
}