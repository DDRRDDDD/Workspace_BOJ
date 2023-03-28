package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Q3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String circle1 = String.format("%.6f", n * n * Math.PI);
		String circle2 = String.format("%.6f", (double)n * n * 2);
		
		
		bw.write(circle1 + "\n" + circle2);
		bw.close();
		
		
	}
}