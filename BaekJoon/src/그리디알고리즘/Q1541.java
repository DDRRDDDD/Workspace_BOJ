package 그리디알고리즘;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] tmp = str.split("-");
		int[] arr = new int[tmp.length];
		
		for(int i = 0; i < tmp.length; i++) {
			String[] s = tmp[i].split("\\+");
			for(int j = 0; j < s.length; j++)
				arr[i] += Integer.parseInt(s[j]);
		}
		
		int result = arr[0];
		for(int i = 1; i < arr.length; i++)
			result -= arr[i];
		
		System.out.println(result);
		
	}

}
