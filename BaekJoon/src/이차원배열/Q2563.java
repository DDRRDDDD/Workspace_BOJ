package 이차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Q2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		ArrayList<ArrayList<Integer>>  arr = new ArrayList<>(100);
		for(int i =0; i < 100; i++) {
			arr.add(i, new ArrayList<Integer>(100));
			for(int j = 0; j < 100; j++) {
				arr.get(i).add(j, 0);
			}
		}

		int cnt = 0;
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int a = x; a < x + 10; a++) {
				for(int b = y; b < y + 10; b++) {
					arr.get(a).set(b, 1);
				}
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
					if(arr.get(i).get(j) == 1) {
						cnt++;
					}
				}
			}
		bw.write(cnt + "");
		bw.close();
	}
}