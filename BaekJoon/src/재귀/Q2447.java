package 재귀;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2447 {
	
	static char[][] arr;
	
	public static void logic(int x, int y, int n, boolean empty) {	
		if(empty) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		int cnt = 0;
		int dec = n / 3;
		
		for(int i = x; i < x + n; i += dec) {
			for(int j = y; j < y + n; j += dec) {
				cnt++;
				if(cnt == 5) {
					logic(i, j, dec, true);
				}else {
					logic(i, j, dec, false);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		
		logic(0, 0, N, false);
		
		for(int i = 0; i < N; i++) {
			bw.write(arr[i]);
			bw.write("\n");			
		}
		
		bw.close();
		
	}
}
// 참고) https://st-lab.tistory.com/95