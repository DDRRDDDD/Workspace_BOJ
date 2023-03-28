package 누적합;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int mod = Integer.parseInt(st.nextToken());
		
		long cnt = 0;
		long[] arr = new long[n+1];
		long[] modArr = new long[mod];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = (arr[i-1] + num) % mod;
			modArr[(int)arr[i]]++;

			if(arr[i] == 0)
				cnt++;
		}
		for(int i = 0; i < mod; i++) {
			if(modArr[i] > 1) {
				cnt += modArr[i] * (modArr[i]-1) / 2;
			}
		}
		System.out.print(cnt);
	}

}
