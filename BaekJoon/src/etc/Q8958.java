package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String tmp;
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			int score = 0;
			int inc = 0;
			tmp = br.readLine();
			for(int j = 0; j < tmp.length(); j++) {
				arr.add(j, tmp.charAt(j) + "");
				if(arr.get(j).equals("O")) {
					inc ++;
				}else {
					inc = 0;
				}
				score = score + inc;
			}
			bw.write(score + "\n");
		}
		bw.close();
	}
}
