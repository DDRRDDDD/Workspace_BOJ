package 일차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < 28; i++) {
			st = new StringTokenizer(br.readLine());
			arr.add(i, Integer.parseInt(st.nextToken()));	
		}
		int[] comarr = new int[30];
		for(int i = 0; i < 30; i ++) {
			comarr[i] = i +1;
			if(!(arr.contains(comarr[i]))) {
				bw.write(comarr[i] + "\n");
			}
		}
		bw.close();
	}
}
