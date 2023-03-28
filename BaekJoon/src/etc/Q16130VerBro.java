package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q16130VerBro {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		byte[] bs = str.getBytes();
		int n = Integer.parseInt(br.readLine());
		bw.write("\n");
		for(int i = 0; i < n; i++) {
	
			String[] splitter = br.readLine().split(" ");
			String findStr = splitter[0];
//			byte by = findStr.getBytes()[0];
		
			int start = Integer.parseInt(splitter[1]);
			int end = Integer.parseInt(splitter[2]);
			int cnt = 0;
			for (int j = start; j <= end; j++) {
				if (findStr.getBytes()[0] == (bs[j])) cnt++;
			}
			
			bw.write(cnt + "\n");
		}
		bw.close();
	}
}


/**
treats
4
t 0 30 -> 2
t 0 4 -> 2
t 4 5 -> 1
t 2 3 -> 0x
*/