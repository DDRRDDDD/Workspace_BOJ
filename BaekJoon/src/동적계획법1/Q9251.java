package 동적계획법1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		
		for(int i = 0; i <= str1.length(); i++)
			dp[i][0] = 0;
		for(int i = 0; i <= str2.length(); i++)
			dp[0][i] = 0;
		
		//LCS
		//최장 공통 부분 수열
		
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= str1.length(); i++) {
			for(int j = 1; j <= str2.length(); j++) {
				//공통 문자를 찾음 +1
				if(str1.charAt(i-1) == str2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
				//공통 문자를 찾지못함 찾았을 때 +1을 할 수 있게 값을 dp에 가져간다
				else
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				
			}
			max = Math.max(max, dp[i][str2.length()]);
		}
		
		bw.write(max + "");
		bw.close();
	}
}
