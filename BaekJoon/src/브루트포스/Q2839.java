package 브루트포스;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	
	public class Q2839 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
			int num = Integer.parseInt(br.readLine());
			int result = 0;
	
	
			if (num % 5 == 0) {
				result = num / 5;
	
			}else if (num % 5 == 1) {
				result = (num / 5 - 1) + 2;
	
			}else if (num % 5 == 2) {
				result = (num / 5 - 2) + 4;
				if(num == 7) {
					result = -1;
				}
				
			}else if(num % 5 == 3) {
				result = (num / 5) + 1;
	
			}else if (num % 5 == 4) {
				result = (num / 5 - 1) + 3;
				if(num == 4) {
					result = -1;
				}
			}

			if(num < 10 && num % 3 == 0) {
				result = num / 3 ;
			}
	
			bw.write(result + "");
			bw.close();
		}
	}
