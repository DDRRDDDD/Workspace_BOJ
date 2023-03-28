package 백트래킹;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9663 {

	static StringBuilder sb = new StringBuilder();

	static int[] arr;
	static boolean[] check;
	static int num;
	
	public static boolean dup() {
		for(int i = 0; i < num; i++) {
		}
		return true;
	}

	public static void logic(int index) {
		if(index == num) {
			if(dup()) {
				for(int i = 0; i < num; i++) {
					sb.append(arr[i]).append(" ");
				}
				sb.append("\n");
			}
		}

		for(int i = 1; i <= num; i++) {
			if(!check[i]) {
				arr[index] = i;
				check[i] = true;
				logic(index + 1);
				check[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());

		arr = new int[num + 1];
		check = new boolean[num + 1];

		logic(0);

		System.out.println(sb);
	}

}
