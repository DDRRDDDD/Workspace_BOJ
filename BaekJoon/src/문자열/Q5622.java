package 문자열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5622 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int size = str.length();
		int time = 0;

		int[] arr = new int[26];

		for(int i = 0; i < 26; i++) {
			if(i < 3) //ABC
				arr[i] = 3;
			else if (3 <= i && i < 6)
				arr[i] = 4;
			else if (6 <= i && i < 9)
				arr[i] = 5;
			else if (9 <= i && i < 12)
				arr[i] = 6;
			else if (12 <= i && i < 15)
				arr[i] = 7;
			else if (15 <= i && i < 19)
				arr[i] = 8;
			else if (19 <= i && i < 22)
				arr[i] = 9;
			else if (22 <= i && i < 26)
				arr[i] = 10;
		}
		for(int i = 0; i < size; i++) {
			time += arr[str.charAt(i) -'A'];
		}
		bw.write(time + "");
		bw.close();
	}
}