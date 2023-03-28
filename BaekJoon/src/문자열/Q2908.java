package 문자열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int size = str.length() ;
		char[] arr = new char[size];
		int A = 0;
		int B = 0;

		for(int i = 1; i <= size; i++) { // 배열 뒤집기
			arr[size - i] = str.charAt(i - 1);
		}
		for(int i = 0; i < size; i++) {
			if(i < 3) {
				A += arr[i] - '0';
				A *= 10;
			}else if(i > 3) {
				B += arr[i] - '0';
				B *= 10;
			}
		}
		if(A > B)
			bw.write((A / 10) + "");
		else 
			bw.write((B / 10) + "");
		bw.close();
	}
}