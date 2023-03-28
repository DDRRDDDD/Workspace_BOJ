package 문자열;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().charAt(Integer.parseInt(br.readLine())-1));
	}
}
