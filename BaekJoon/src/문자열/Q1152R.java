package 문자열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1152R {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int size = str.length();
		char[] arr = new char[size];
		int cnt = 1;

		for(int i = 0; i < size; i++) {
			arr[i] = str.charAt(i);
			if(arr[0] == ' ') {
				if(size == 1) {
					cnt = 0;
					break;
				}
				arr[0] = 'a';
			}
			else if(arr[str.length() - 1] == ' ') {
				arr[size - 1] = 'a';
			}
			else if(arr[i] == ' ') {
				cnt++;				
			}
		}
		bw.write(cnt + "");
		bw.close();
	}
}