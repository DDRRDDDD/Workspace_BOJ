package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> arr = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			Integer x = st.countTokens() > 0 ? Integer.parseInt(st.nextToken()) : null;
			
			switch (str) {
			case "push_front":
				arr.addFirst(x);
				break;
				
			case "push_back":
				arr.addLast(x);
				break;
				
			case "pop_front":
				if((x = arr.pollFirst()) != null)
					sb.append(x);				
				else
					sb.append(-1);
				
				sb.append("\n");
				break;
				
			case "pop_back":
				if((x = arr.pollLast()) != null)
					sb.append(x);
				else
					sb.append(-1);
				
				sb.append("\n");
				break;
				
			case "size":
				sb.append(arr.size()).append("\n");
				break;
				
			case "empty":
				if(arr.size() > 0)
					sb.append(0);
				else
					sb.append(1);
				
				sb.append("\n");
				break;
				
			case "front":
				if((x = arr.peekFirst()) != null)
					sb.append(x);
				else
					sb.append(-1);
				
				sb.append("\n");
				break;
				
			case "back":
				if((x = arr.peekLast()) != null)
					sb.append(x);
				else
					sb.append(-1);
				
				sb.append("\n");
				break;
			}
		}
		System.out.print(sb);
	}

}
