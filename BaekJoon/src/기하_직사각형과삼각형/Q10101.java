package 기하_직사각형과삼각형;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String str = "";
		
		if(a == b || b == c || a == c) {
			str = "Isosceles";
			if(a==b && b == c) {
				str = "Equilateral";
			}
		}
		
		if(a != b && b != c && a != c)
			str = "Scalene";
		
		if(a+b+c != 180)
			str = "Error";
		
		if(a == 0 || b ==0 || c ==0)
			str = "Error";
		
		System.out.println(str);
	}
}
