package 심화1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1157R {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().toLowerCase();
		int strsize = str.length();
		int[] arr = new int[26];
		int max = 0;
		char ch = '?';

		for(int i = 0; i < strsize; i++) {
			arr[str.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch =(char)(i + 'A');
			}else if(max == arr[i]) {
				ch = '?';
			}
		}
		bw.write(ch);
		bw.close();
	}
}