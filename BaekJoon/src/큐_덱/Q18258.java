package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] queue = new int[n+1];
		
		int front = 0;
		int rear = -1;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			String method = st.nextToken();
			int x = st.countTokens() > 0 ? Integer.parseInt(st.nextToken()) : 0;
			
			switch (method) {
			case "push":
				queue[++rear] = x;
				break;
				
			case "pop":
				if(front > rear)
					sb.append(-1).append("\n");
				else
					sb.append(queue[front++]).append("\n");
				break;
				
			case "size":
				sb.append(rear-front+1).append("\n");
				break;
				
			case "empty":
				if(front > rear)
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				break;
				
			case "front":
				if(front > rear)
					sb.append(-1).append("\n");
				else
					sb.append(queue[front]).append("\n");
				break;
				
			case "back":
				if(front > rear)
					sb.append(-1).append("\n");
				else
					sb.append(queue[rear]).append("\n");
			}
		}
		System.out.println(sb);

	}

}
