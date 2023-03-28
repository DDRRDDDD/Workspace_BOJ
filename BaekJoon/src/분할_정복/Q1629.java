package 분할_정복;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1629 {
	
	private static long a, b, c;
	
	private static long div(long part) {
		if(part == 1)
			return a;
		
		long p = part / 2;
		
		// 지수 법칙에 따라서 만약에 3^10이라는 수가 있으면
		// 3^5 X 3^5와 같다 
		// 즉, part/2 ex)10/2 함수를 돌려서 이미 결과를 도출 해냈으니
		// 불필요한 탐색을 막을 수 있다. 세미 dp
		
		long tmp = div(p);
		
		if(part % 2 == 1)
			return (tmp*tmp%c) * (a%c) % c;
		
		return tmp*tmp%c;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		
		System.out.println(div(b)%c);
	}
}


