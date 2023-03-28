package 집합과맵;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
				
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			bw.write(map.getOrDefault(key, 0) + " ");
		}
		bw.close();
	}
}

// 참고 : https://st-lab.tistory.com/267