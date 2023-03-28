package etc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050 {
	public static int logic(int a, int b) {
		if(b == 0 || a == b)
			return 1;
		
		return logic(a - 1, b - 1) + logic(a - 1 , b);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		
		sb.append(logic(num1, num2));
		System.out.print(sb);
	}

}
