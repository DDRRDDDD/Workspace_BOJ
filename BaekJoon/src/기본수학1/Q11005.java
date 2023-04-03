package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(n > 0) {
			list.add(n % b);
			n /= b;
		}
		
		int size = list.size()-1;
		for(int i = size; i >= 0; i--) {
			int num = list.get(i);
			char ch = 0;
			if(num < 10)
				ch = (char) (num + '0');
			else
				ch = (char)(num + '7');
			
			System.out.print(ch);
		}
	}

}
