package 심화1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		int cnt = 0;

		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			if(check(str)) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.close();
	}
	static boolean check(String str) {
		boolean[] arr = new boolean[26];
		int tmp = 0; // 다음 문자와 비교하기 위해 담아두는 변수

		for(int i = 0; i < str.length(); i++) {
			int current = str.charAt(i);

			if(tmp != current) {
				if(arr[current - 'a'] == false) {
					arr[current - 'a'] = true;
					tmp = current;
				}else  // arr[current - 'a'] == true
					return false;
			}else // tmp == current
				continue;
		}// for문의 끝
		return true; 
	}
}
