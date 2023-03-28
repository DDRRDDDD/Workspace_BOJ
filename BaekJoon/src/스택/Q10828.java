package 스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10828 {
	private static int cnt;
	private static int[] arr;
	private static StringBuilder sb;
	
	public static void logic(String str, int x) {
		switch (str) {
		case "push":
			arr[cnt++] = x;
			break;
			
		case "pop":
			if(cnt-1 < 0)
				sb.append(-1).append("\n");
			else {
				sb.append(arr[cnt-1]).append("\n");
				arr[cnt-1] = 0;
				cnt--;
			}
			break;
			
		case "size":
			sb.append(cnt).append("\n");
			break;
			
		case "empty":
			if(cnt < 1)
				sb.append(1).append("\n");
			else 
				sb.append(0).append("\n");
			break;
			
		case "top":
			if(cnt-1 < 0)
				sb.append(-1).append("\n");
			else 
				sb.append(arr[cnt-1]).append("\n");
			break;
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		cnt = 0;
		
		sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			int x = 0;
			String[] str = br.readLine().split(" ");
			if(str.length > 1)
				x = Integer.parseInt(str[1]);
			logic(str[0], x);	
		}
		
		System.out.print(sb);
		
	}

}
