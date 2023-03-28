package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q16130 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		int size = str.length();
		
		int[][] arr = new int[26][size + 1];
		
		for(int i = 0; i < 26; i++) {
			for(int j = 1; j <= size; j++) {
				arr[i][j] += arr[i][j-1];
				if(i == str.charAt(j-1) - 'a')
					arr[i][j]++;
			}
			
		}
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			char ch = st.nextToken().charAt(0);
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			int curAlphaIdx = ch - 'a';
			bw.write(arr[curAlphaIdx][end + 1] - arr[curAlphaIdx][start] + "\n");
			
		}
		bw.close();

	}

}
