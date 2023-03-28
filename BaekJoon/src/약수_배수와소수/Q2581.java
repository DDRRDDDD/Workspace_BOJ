package 약수_배수와소수;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Q2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		int min = b;
		int sum = 0;

		for(int i = a; i <= b; i++) {
			if(i == 1) {
				continue;
			}else if(i == 2) {
				sum = 2;
				min = 2;
				continue;
			}
			for(int j = 2; j < i; j++){
				if(i % j == 0) {
					break;
				}else if (i-1 == j && i % j != 0) {
					sum += i;
					if(i < min) {
						min = i;
					}
				}
			}
		}
		if(sum == 0) {
			bw.write(-1 + "");
		}else {
			bw.write(sum + "\n" + min);
		}
		bw.close();
	}
}