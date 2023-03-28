package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<String> set = new HashSet<String>();
		
		String str = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				if(set.add(str.substring(j -i, j + 1)))
					cnt++;
			}				
		}
		bw.write(cnt + "");
		bw.close();
	}
}