package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		HashMap<String, Integer> map;
		ArrayList<Integer> arr;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			map = new HashMap<String, Integer>();
			
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				String key = st.nextToken();
				key = st.nextToken();
				map.put(key, map.getOrDefault(key, 0) + 1);	
			}
			
			arr = new ArrayList<Integer>(map.values());
			
			int tmp = 1;
			for(int list : arr)
				tmp *= list + 1;
			
			bw.write((tmp - 1) + "\n");
		}
		bw.close();
	}
}