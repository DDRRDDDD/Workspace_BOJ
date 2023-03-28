package 조건문;
import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if(a == b && b == c && c == a) { // 주사위 3개가 다맞는 경우
			System.out.println(10000 + a * 1000);
		}else if(a == b ||  b == c || a == c) { // 주사위가 2개만 맞는 경우
			if(a == b) {
				System.out.println(1000 + a * 100);
			}else if (b == c) {
				System.out.println(1000 + b * 100);				
			}else {
				System.out.println(1000 + c * 100);								
			}
		}else { // 주사위가 전부 일치 하지 않는 경우
			if(a > b) {
				if(c > a) {
					System.out.println(c * 100);
				}else {
					System.out.println(a * 100);
				}
			}else if(b > a) {
				if(c > b) {
					System.out.println(c * 100);
				}else {
					System.out.println(b * 100);
				}
			}
		}
	}
}