package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1037 {
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < min)
				min = num;
			if(num > max)
				max = num;
		}
		
		bw.write((min * max) + "");
		bw.close();
	}
	
}