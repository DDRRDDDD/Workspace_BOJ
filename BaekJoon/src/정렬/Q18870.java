package 정렬;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sorted = new int[n];
		HashMap<Integer, Integer> rank = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		Arrays.sort(sorted);		
		

		int ranking = 0;
		for(int i : sorted) {
			if(!rank.containsKey(i)) {
				rank.put(i, ranking);
				ranking++;
			}
		}

		for(int i : arr) {
			bw.write(rank.get(i) + " ");
		}
		bw.close();
	}
}
