package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int front = 0;
		int rear = n-1;
		int[] queue = new int[n*(n/2+1)];
		for(int i = 0; i < n; i++)
			queue[i] = i+1;
		
		while(front != rear) {
			if(front % 2 == 0)
				front++;
			else {
				queue[++rear] = queue[front++];
			}
		}
		System.out.print(queue[front]);
	}

}
