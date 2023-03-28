package 심화1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int length = str.length() / 2;
		int result = 1;
		
		for(int i = 0; i < length; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(str.length()-1-i);
			if(ch1 != ch2)
				result = 0;
		}
		
		System.out.println(result);
	}

}
