package 심화1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = " " + br.readLine();
		int size = str.length();
		int cnt = size - 1;
		
		char[] arr = new char[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = str.charAt(i);
		}
		for(int i = 1; i < size; i++) {
			if(arr[i] == 'j' && (arr[i-1] == 'n' || arr[i-1] == 'l')) {
				cnt--;
			}else if(arr[i] == '-' && (arr[i-1] == 'd' || arr[i-1] == 'c')) {
				cnt--;
			}else if(arr[i] == '=' && (arr[i-1] == 'z' || arr[i-1] == 's'
					|| arr[i-1] == 'c')) {
				if(arr[i -1] == 'z' && arr[i - 2] == 'd') {
					cnt--;
				}
				cnt--;
			}
		}
		bw.write(cnt + "");
		bw.close();
	}
}