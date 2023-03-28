package 반복문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str;
		int cnt = Integer.parseInt(br.readLine());

		for(int i = 1; i <= cnt; i++) {
			str = new StringTokenizer(br.readLine());
			bw.write("Case #" + i + ": " + 
					(Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()))  
					);
		}
		bw.close();
	}
}