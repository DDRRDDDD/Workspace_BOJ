package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				
				//이부분이 굉장히 중요한데 ( 까먹고 있엇음)
				// 계속해서 j 인덱스에 대해서 +1을 해주는 조건으로 큰수가 나올 떄마다 ++ 해줄 수 있
				// 그러면 i가 높을 때 마다 1씩 증가함
				// 같거나 낮으면 훑고 지나가기 때문( 말하자면 max가 i임)
				
				if(arr[i] > arr[j])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			max = Math.max(max, dp[i]);
		}
		bw.write(Arrays.toString(dp)+"\n");
		bw.write(max + "");
		bw.close();
	}

}
