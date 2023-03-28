package 브루트포스;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1018 {

	public static int logic(char[][] arr, int ms, int ns) {
		int[] cnt = new int[2];
		char color1 = 'W';
		char color2 = 'B';
		
		for(int a = 0; a < 2; a++) {
			for(int i = ms; i <= ms + 7; i++) {
				for(int j = ns + 1; j <= ns + 7; j += 2) {

					// 중복이면 하나를 색칠해라
					if(arr[i][j-1] == arr[i][j])
						cnt[a]++;
					// 순서가 바뀌었으면 두개를 색칠해라
					if(arr[i][j-1] == color2 && arr[i][j] == color1)
						cnt[a] +=2;
				}
				char tmp = color1;
				color1 = color2;
				color2 = tmp;
			}
			color1 = 'B';
			color2 = 'W';
		}

		return cnt[0] < cnt[1] ? cnt[0] : cnt[1];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken()); // 세로
		int n = Integer.parseInt(st.nextToken()); // 가로
		int min = Integer.MAX_VALUE;

		char[][] arr = new char[m][n];

		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j ++) {
				arr[i][j] = s.charAt(j);
			}
		}
		br.close();

		int tmp = 0;
		for(int i = 0 ; i < m - 7; i++) {
			for(int j = 0; j < n - 7; j++) {
				tmp = logic(arr, i, j);

				if(tmp < min)
					min = tmp;
			}
		}
		bw.write(min + "");
		bw.close();
	}

}
