package 이차원배열;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[][] arr = new String[5][15];

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 15; j++) {
				arr[i][j] = "";
			}
		}

		for(int i = 0; i < 5; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = String.valueOf(str.charAt(j));

			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				sb.append(arr[j][i]);
			}
		}
		System.out.println(sb);
		
	}
}
