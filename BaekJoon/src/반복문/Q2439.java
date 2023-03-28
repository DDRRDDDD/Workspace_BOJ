package 반복문;
import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.close();
		for(int i = 1; i <= t; i++) {
			for(int x = t-1; x >= i; x--) {
				System.out.print(" ");
			}
			for(int y = 1; y <= i; y++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
