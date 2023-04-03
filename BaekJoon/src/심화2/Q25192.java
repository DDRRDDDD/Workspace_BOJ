package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q25192 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				set.clear();
				continue;
			}
			
			if(set.add(str))
				count += 1;
		}
		System.out.println(count);
	}

}
