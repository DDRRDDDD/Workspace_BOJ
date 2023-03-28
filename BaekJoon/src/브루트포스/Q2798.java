package 브루트포스;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // 카드의 총 수
		int jack = Integer.parseInt(st.nextToken()); // 블랙잭
		int[] card = new int[n]; // 카드를 담는 배열
		int max = 9;

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int sum = 0;
		for(int i  = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int z = j + 1; z < n; z++) {
					sum = card[i] + card[j] + card[z];
					if(max < sum && sum <= jack)
						max = sum;
				}
			}
		}
		bw.write(max + "");
		bw.close();
		
	}

}
