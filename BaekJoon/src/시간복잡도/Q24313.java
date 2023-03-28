package 시간복잡도;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q24313 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());

		int c = Integer.parseInt(br.readLine());

		int n = Integer.parseInt(br.readLine());

		for(int i = n; i <= 100; i++) {
			if(!((a1*i)+a0 <= c*i)) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);

	}

}
