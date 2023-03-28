package etc;
import java.util.Arrays;

public class Q4673 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10000];
		Arrays.fill(arr, false);
		
		for(int i = 0; i < arr.length; i++) {
			int x = d(i + 1);
			if(x <= 10000) {
				arr[x -1] = true;
			}
			if(arr[i] == false) {
				System.out.println(i + 1);
			}
		}
	}

	public static int d(int x) {
		int sum = x;
		do {
			sum = sum + (x % 10);
			x = x / 10 ;
		}while(x != 0);
		return sum;
	}
}