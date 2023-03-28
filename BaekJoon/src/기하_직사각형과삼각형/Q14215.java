package 기하_직사각형과삼각형;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int result = 0;
		
		if(a + b > c)
			result += c;
		else
			result += a+b - 1;
		
		if(a + c > b)
			result += b;
		else
			result += a+c -1;
		
		if(b + c > a)
			result += a;
		else
			result += b+c -1;
		
		System.out.println(result);
	}
}
