package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Q5430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		main : for(int j = 0; j < n; j++) {
			char[] function = br.readLine().toCharArray();
			int m = Integer.parseInt(br.readLine());
			String[] tmp = br.readLine().split("[^\\d]");

			LinkedList<Integer> deque = new LinkedList<Integer>();
			for(int i = 0; i < m; i++)
				deque.add(Integer.parseInt(tmp[i+1]));
			
			int cnt = 0;
			for(int i = 0; i < function.length; i++) {
				if(function[i] == 'R')
					cnt++;
				else {
					//정배열
					if(cnt % 2 == 0) {
						Integer x = deque.pollFirst();
						if(x == null) {
							sb.append("error").append("\n");
							continue main;
						}
					//역배열
					}else {
						Integer x = deque.pollLast();
						if(x == null) {
							sb.append("error").append("\n");
							continue main;
						}
					}
				}
			}
			int size = deque.size();
			sb.append("[");
			for(int i = 0; i < size; i++) {
				if(cnt%2==0)
					sb.append(deque.pollFirst());
				else
					sb.append(deque.pollLast());
				
				if(i != size-1)
					sb.append(",");
			}
			sb.append("]").append("\n");
		}// main for문 끝
		System.out.println(sb);
	}

}

