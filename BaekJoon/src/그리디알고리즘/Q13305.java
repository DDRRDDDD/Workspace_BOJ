package 그리디알고리즘;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		long[] distance = new long[n];
		long[] point = new long[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n; i++)
			distance[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++)
			point[i] = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		long min = point[1];
		for(int i = 1; i < n; i++) {
			min = Math.min(min, point[i]);
			
			sum += min * distance[i];
		}
		System.out.print(sum);
	}

}

// 전 코드는 dp를 사용해서 했는데 17점이 나왔다
// 아마도 테스트 케이스의 범위가 넓어서 메모리 초과가 나오고 연산이 많아 
// 17점 점수 까지는 사용 가능한거같다
// (내 제출) 참고

