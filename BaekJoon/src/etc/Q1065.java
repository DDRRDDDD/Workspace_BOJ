package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			if(i < 99) {
				cnt++;
			}else if(99 <= i && i < 999) {
				if(com(i +1)) {
					cnt++;
				}
			}
		}
		bw.write(cnt + "");
		bw.close();
	}
	public static boolean com(int x) {
		int tmp = x;
		ArrayList<Integer> seq = new ArrayList<>(3);
		for(int i = 0; i < 3; i++) {
			seq.add(i, tmp % 10);
			tmp = tmp / 10;
		}
		int fseq = seq.get(0) - seq.get(1);
		int bseq = seq.get(1) - seq.get(2);
		if(fseq == bseq) {
			return true;
		}else {
			return false;
		}
	}
}

// 