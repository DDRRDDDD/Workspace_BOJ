package 일차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2562 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st;
		
		int max = 0;
		int mi = 0;
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			arr.add(i, Integer.parseInt(st.nextToken()));
			if(max < arr.get(i)) {
				max = arr.get(i);
				mi = i + 1;
			}			
		}
		bw.write(max + "\n" + mi);
		bw.close();
	}
}
