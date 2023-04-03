package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q7785 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String commute = st.nextToken();
			map.put(name, commute);
		}
		
		ArrayList<String> arr = new ArrayList<>(map.keySet());
		arr.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		
		for(String str : arr) {
			if(map.get(str).equals("enter"))
				System.out.println(str);
		}
	}

}
