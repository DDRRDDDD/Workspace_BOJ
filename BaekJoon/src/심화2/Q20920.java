package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q20920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();

		int n = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			String word = br.readLine();
			if(word.length() < length)
				continue;
			
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		list.sort(new Comparator<String>() {
		
			@Override
			public int compare(String o1, String o2) {
				int c1 = map.get(o1);
				int c2 = map.get(o2);
				
				if(c1 != c2)
					return c2 - c1;
				
				else if(o1.length() != o2.length())
					return o2.length() - o1.length();
				
				else
					return o1.compareTo(o2);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		int size = list.size();
		for(int i = 0; i < size; i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}
