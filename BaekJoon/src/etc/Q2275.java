package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2275 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15]; // (층 / 호) 

		for(int i = 1; i <= 14; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		int f = 0;
		int h = 0; 
		
		for(int a = 0; a < n; a++) {
			f = Integer.parseInt(br.readLine());
			h = Integer.parseInt(br.readLine());
			for(int i = 1; i <= f; i++) { // 층
				for(int j = 2; j <= h; j++) { // 호
					arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
				}
			}
			bw.write(arr[f][h] + "\n");
		}
//		for(int i = 0; i < 15; i++) {
//			for(int j =0; j < 14; j++) {
//				bw.write(arr[i][j] + " ");
//			}
//			bw.write("\n");
//		}
		bw.close();	
	}
}
// 2
// 1 층
// 3 호
// 2 층
// 3 층