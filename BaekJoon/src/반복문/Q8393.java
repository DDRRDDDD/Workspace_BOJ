package 반복문;
import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i < a + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
