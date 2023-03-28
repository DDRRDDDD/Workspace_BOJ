package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = br.readLine();
		br.close();
		
		int numSize = num.length();
		int[] arr = new int[numSize];
		int[] cnt = new int[10];
		int[] result = new int[numSize];
		
		
		for(int i = 0; i < numSize; i++) { // 문자열을 하나씩 쪼개여서 배열 저장
			arr[i] = num.charAt(i) - '0';
		}
		for(int i = 0; i < numSize; i++) { // 카운팅 배열 저장
			cnt[arr[i]]++;
		}
		for(int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}
		for(int i = arr.length - 1; i >= 0; i--) {
			int value = arr[i];
			cnt[value]--;
			result[cnt[value]] = value;
		}
		for(int i = numSize -1 ; i >= 0; i--) {
			bw.write(result[i] + "");
		}
		bw.close();
	}
}

// n  <= 1,000,000,000