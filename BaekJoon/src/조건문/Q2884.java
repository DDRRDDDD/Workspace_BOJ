package 조건문;
import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		if(minute < 45) {
			hour --;
			minute = 60 + (minute - 45);
			
			if(hour < 0) {
				hour = 23;
		}
			System.out.println(hour + " " + minute);
		}else if(minute >= 45) {
			minute = minute - 45;
			System.out.println(hour + " " + minute);
		}
	}
}
