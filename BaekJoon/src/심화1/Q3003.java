package 심화1;
import java.util.Scanner;

public class Q3003 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int[] cnt = new int[6];
		int[] full = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++) {
			cnt[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i <full.length; i++) {
			cnt[i] = full[i] - cnt[i];
			System.out.println(cnt[i]);
		}	
	}
}
