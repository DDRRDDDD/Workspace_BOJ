package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		LinkedList<Integer> deque = new LinkedList<Integer>();
		for(int i = 0; i < n; i++)
			deque.add(i+1);
		
		int result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int cnt = 0;
			int num = Integer.parseInt(st.nextToken());
			
			while(deque.peek() != num) {
				deque.add(deque.pop());
				cnt++;
			}
			result += Math.min(cnt, deque.size()-cnt);
			deque.pop();
		}
		System.out.print(result);
	}

}
