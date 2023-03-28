package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			list.add(i, Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);

		for(int value : list) {
			bw.write(value + "\n");
		}
		bw.close();
	}
}