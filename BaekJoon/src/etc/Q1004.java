package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1004 {
	// 시작과 마지막 좌표의 x 와 y
	public static int x1, x2, y1, y2;
	public static int logic(int cx, int cy, int r){
		// 조건 좌표 1 이나 좌표 2를 원 안에 포함하는가?
		// (x1 - c1)제곱 + (y2 - c2)제곱 < r제곱
		// (x2 - c1)제곱 + (y2 - c2)제곱 < r제곱

		double num1 = Math.pow((x1 - cx), 2);
		double num2 = Math.pow((y1 - cy), 2);
		double num3 = Math.pow((x2 - cx), 2);
		double num4 = Math.pow((y2 - cy), 2);
		double rr = Math.pow(r, 2);
		
		boolean bol = !(num1 + num2 < rr || num3 + num4 < rr) ;
		boolean bol2 = num1 + num2 < rr && num3 + num4 < rr;
		
		if(bol || bol2)
			return 0;
		else
			return 1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			int m = Integer.parseInt(br.readLine());
			
			int cnt = 0;
			for(int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				cnt += logic(cx, cy, r);
			}
			sb.append(cnt).append("\n");
		}
		bw.write(sb + "");
		bw.close();
	}
}