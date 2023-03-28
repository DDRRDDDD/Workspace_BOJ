package 약수_배수와소수;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q5086 {
	
	public static String logic(int num1, int num2) {
		/*
		 * 1. 첫 번째 숫자가 두 번째 숫자의 약수이다. ==> factor
		 * 2. 첫 번째 숫자가 두 번째 숫자의 배수이다. ==> multiple
		 * 3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다. ==> neither
		 */
		if(num2 % num1 == 0)
			return "factor";
		else if(num1 % num2 == 0)
			return "multiple";
		else
			return "neither";
				
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());			
			
			if(num1 == num2) break;

			bw.write(logic(num1, num2) + "\n"); 
		}
		bw.close();
	}
}