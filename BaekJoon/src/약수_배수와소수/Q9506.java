package 약수_배수와소수;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9506 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		String tmp = "";
		while(!(tmp = br.readLine()).equals("-1")) {
			int num = Integer.parseInt(tmp);
			StringBuilder sb = new StringBuilder(num + " =");

			
			int sum = 0;
			for(int i = num; i >= 2; i--) {
				if(num % i == 0) {
					int div = num / i;
					sum += div;

					sb.append(" "+div).append(" +");
				}
			}
			
			if(sum == num) {
				sb.deleteCharAt(sb.length() - 1);
				bw.write(String.format("%s\n", sb.toString()));
			}else
				bw.write(String.format("%d is NOT perfect.\n", num));
		}
		bw.close();
	}

}
