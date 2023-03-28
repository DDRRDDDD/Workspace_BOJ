package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		final int SIZE = 1000*1000 + 1;
		int[] queue = new int[SIZE];
		int[] result = new int[n];
		for(int i = 0; i < n; i++)
			queue[i] = (i+1);

		int cnt = 1;
		int front = 0;
		int rear = n-1;
		while(cnt/k <= n) {
			if(cnt % k == 0)
				result[cnt/k - 1] = queue[front++];
			else 
				queue[++rear] =queue[front++];				
			
			cnt++;
		}
		System.out.print("<");
		for(int i = 0; i < n-1; i++) {
			System.out.print(result[i] +", ");
		}
		System.out.print(result[n-1] + ">");
	}

}
