package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];

		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String a1, String a2) {
				if(a1.length() == a2.length()) {
					return a1.compareTo(a2);
				}else {
					return a1.length() - a2.length();
				}
			}
		});
		
		bw.write(arr[0] + "\n");
		for(int i = 1; i < n; i++) {
			if(!arr[i-1].equals(arr[i])) {
				bw.write(arr[i] + "\n");
			}
		}
		bw.close();
	}

}