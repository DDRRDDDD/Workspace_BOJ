package 집합과맵;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			String number = String.valueOf(i);
			map.put(number, str);
			map.put(str, number);
			
		}
		for(int i = 0; i < m; i++) {
			String tmp = br.readLine();
			bw.write(map.get(tmp) + "\n");
		}
		bw.close();
	}

}