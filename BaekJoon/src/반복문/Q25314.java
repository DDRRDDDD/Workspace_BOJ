package 반복문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q25314 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()) / 4;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++)
			sb.append("long").append(" ");
		
		sb.append("int");
		bw.write(sb + "");
		bw.close();
	}

}
