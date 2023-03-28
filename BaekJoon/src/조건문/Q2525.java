package 조건문;
import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		sc.close();

		int tmp = 60 * h + m + t; // 분으로 전부 치환

		int hour = (tmp / 60) % 24;
		int minute = tmp % 60;

		System.out.println(hour + " " + minute);
	}
}