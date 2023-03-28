package 이차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>(); 
		ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
		
		for(int i =0; i < n; i++) {
			arr1.add(i, new ArrayList<Integer>());
			st = new StringTokenizer(br.readLine());
			for(int j =0; j < m; j++) {
				arr1.get(i).add(j, Integer.parseInt(st.nextToken()));
			}
		}
		for(int i =0; i < n; i++) {
			int sum = 0;
			arr2.add(i, new ArrayList<Integer>());
			st = new StringTokenizer(br.readLine());
			for(int j =0; j < m; j++) {
				sum = Integer.parseInt(st.nextToken()) + arr1.get(i).get(j);
				arr2.get(i).add(j, sum);
				bw.write(arr2.get(i).get(j) + " ");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
