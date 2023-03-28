package 일차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		
		int n = Integer.parseInt(br.readLine());
		int com = 0;
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(i,Integer.parseInt(st.nextToken()));
		}
		StringTokenizer str = new StringTokenizer(br.readLine());
		com = Integer.parseInt(str.nextToken());
		
		for(int i = 0; i < n; i++) {
			if(arr.get(i) == com) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.close();
	}
}