package 심화1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int SIZE = 20;
		
		double[] hack = new double[9];
		double aPlus = 4.5;
		for(int i = 0; i < hack.length; i++) {
			hack[i] = aPlus;
			aPlus -= 0.5;
		}
		hack[8] -= 0.5;
		
		double result = 0.0;
		double sum = 0.0;
		StringTokenizer st;
		for(int k = 0; k < SIZE; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String str = st.nextToken();
			
			if(str.equals("P")) continue;
			else if(str.equals("A+")) {sum += score; score *= hack[0]; }
			else if(str.equals("A0")) {sum += score; score *= hack[1]; }
			else if(str.equals("B+")) {sum += score; score *= hack[2]; }
			else if(str.equals("B0")) {sum += score; score *= hack[3]; }
			else if(str.equals("C+")) {sum += score; score *= hack[4]; }
			else if(str.equals("C0")) {sum += score; score *= hack[5]; }
			else if(str.equals("D+")) {sum += score; score *= hack[6]; }
			else if(str.equals("D0")) {sum += score; score *= hack[7]; }
			else if(str.equals("F"))  {sum += score; score *= hack[8]; } 
			
			result += score;
		}
		bw.write(String.format("%.6f", result/sum));
		bw.close();
	}

}
