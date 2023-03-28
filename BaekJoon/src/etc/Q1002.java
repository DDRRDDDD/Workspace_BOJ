package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1002 {
	public static int logic(int x1, int y1, int r1, int x2, int y2, int r2) {
		int lr = r1;
		int sr = r2;
		if(r1 < r2) {
			lr = r2;
			sr = r1;
		}
		int tmp1 = x1 - x2;
		int tmp2 = y1 - y2;
		double d = Math.sqrt(tmp1 * tmp1 + tmp2 * tmp2);
		// 좌표가 동일한지 판단
		if(x1 == x2 && y1 == y2) {
			//두원이 겹치는 경우
			if(r1 == r2)
				return -1;
			//중심좌표는 같지만, 반지름이 다른 경우
			else 
				return 0;

		}else {
			//내접 || || 중심 좌표가 다르고 만나지 않는다(원 안)
			if(lr >= sr + d) {
				if(lr > sr + d)
					return 0;
				else
					return 1;	
			}
			//외접 ||  두점에서 만나는 경우
			if(d <=lr + sr) {
				if(d < lr + sr)
					return 2;
				else 
					return 1;
			}
		}
		// 그
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(logic(
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()))
					+ "\n");
		}
		bw.close();
	}
}