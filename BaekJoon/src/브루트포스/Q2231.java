package 브루트포스;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int result = n;
		int num = n;
		while(num > 0) {
			int tmp = num;
			int sum = num;
			
			while(tmp != 0) {
				sum += tmp % 10;   
				tmp /= 10;
			}
			if(n == sum) {
				result = num;
			}
			num--;
		}
		
		if(result == n) {
			result = 0;
		}
		bw.write(result + "");
		bw.close();
	}
}
// n 값 보다 작아야함
//