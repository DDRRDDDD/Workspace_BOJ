package 재귀;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Q10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int result = factorial(num);
		bw.write(result + "");
		bw.close();

	}
	static int factorial(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
//	factorial(6)
//	6 * factorial(5){
//		5 * factorial(4){
//			4 * factorial(3){
//				3 * factorial(2){
//					2 * factorial(1){
//						return 1;
//					}
//					return 2 * 1;
//				}
//				return 3 * 2 * 1;
//			}
//			return 4 * 3 * 2 * 1;
//		}
//		return 5 * 4 * 3 * 2 * 1;
//	}
//	return 6 * 5 * 4 * 3 * 2 * 1;