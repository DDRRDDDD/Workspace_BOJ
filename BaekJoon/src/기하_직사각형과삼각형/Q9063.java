package 기하_직사각형과삼각형;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int maxY = -10001;
		int maxX = -10001;
		int minY = 10001;
		int minX = 10001;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			maxX = Math.max(maxX, x);
			minX = Math.min(minX, x);
			maxY = Math.max(maxY, y);
			minY = Math.min(minY, y);
		}
		System.out.println((maxX-minX)*(maxY-minY));
	}
}
