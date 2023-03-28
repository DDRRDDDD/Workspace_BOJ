package 재귀;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Q10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); 
		
		int result = input(n);
		bw.write(result + "");
		bw.close();

	}
	public static int input(int n) {
		if(n <= 1) 
			return n;
		else 
			return input(n - 2) + input(n - 1);
	}
}