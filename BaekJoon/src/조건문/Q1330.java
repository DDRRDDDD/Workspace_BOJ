package 조건문;
import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.println(">");
		}if(a < b) {
			System.out.println("<");
		}if(a == b) {
			System.out.println("==");
		}
	}
}