package 문자열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char ch;
		String st = br.readLine();
		ArrayList<Integer> arr = new ArrayList<>(26);
		for(int i = 0; i < 26; i++) {
			arr.add(i, -1);
		}
		for(int i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			if(arr.get(ch - 'a') == -1) {
				arr.set(ch - 'a', i);
			}
		}
		for(int result : arr) {
			bw.write(result + " ");
		}
		bw.close();
	}
}
// char 타입은 아스키 코드로 치환하여 int 값으로 사용이 가능하