package 이차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int max = 0;
		int y = 0;
		int x = 0;
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			arr.add(i, new ArrayList<Integer>());
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr.get(i).add(j, Integer.parseInt(st.nextToken()));
				if(max < arr.get(i).get(j)) {
					max = arr.get(i).get(j);
					y = i;
					x = j;
				}
			}
		}
		bw.write(max + "\n" + (y + 1) + " " + (x + 1));
		bw.close();
	}
}