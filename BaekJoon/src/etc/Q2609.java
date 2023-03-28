package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609 {
	public static int logic1(int num1, int num2) {
		int a = num1;
		int b = num2;
		while(true) {
			if(a > b) 
				b += num2;
			else if(b > a) 
				a += num1;
			else
				return a;
		}
	}
	
	public static int logic2(int num1, int num2) {
		int a = num1;
		int b = num2;
		if(num1 < num2) {
			a = num2;
			b = num1;
		}
		
		while(0 != a % b) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return b;
	}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		// 최대 공약수
		int result1 = logic2(num1, num2);
		// 최소 공배수
		int result2 = logic1(num1, num2);

		bw.write(result1 + "\n" + result2);
		bw.close();
	}
}