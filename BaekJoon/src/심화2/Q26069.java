package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q26069 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();
		set.add("ChongChong");

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name1 = st.nextToken();
			String name2 = st.nextToken();

			if(set.contains(name1) || set.contains(name2)) {
				set.add(name1);
				set.add(name2);
			}
		}
		System.out.println(set.size());
	}

}
