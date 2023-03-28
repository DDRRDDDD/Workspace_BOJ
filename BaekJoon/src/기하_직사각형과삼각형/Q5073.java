package 기하_직사각형과삼각형;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0)
				break;
			
			String str = "";
			if(a == b || a == c || b == c) {
				str = "Isosceles";
				if(a == b && b == c) {
					str = "Equilateral";					
				}
			}
			
			else
				str = "Scalene";
			
			boolean aBool = a + b > c;
			boolean bBool = a + c > b;
			boolean cBool = b + c > a;
			if(!(aBool && bBool && cBool)) {
				str = "Invalid";
			}
			
			sb.append(str).append("\n");
		}
		System.out.println(sb.toString());
	}
}
