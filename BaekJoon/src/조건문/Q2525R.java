package 조건문;
import java.util.Scanner;

public class Q2525R {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int timer = sc.nextInt();
		sc.close();

		if(minute + timer >= 60) {
			hour = hour + (minute + timer) / 60;
			minute = (minute + timer) % 60;
			
			if(hour > 23) {
				hour = (minute + timer) / 60;
			}
			System.out.println(hour + " " + minute);
		}else if(minute + timer < 60) {
			minute = minute + timer;
			System.out.println(hour + " " + minute);
		}
	}
} 
// 오답 반례를 들어보면 한시간씩 이격이 생긴다 해당문제는 시간과 분을 나누어 계산해서 생긴문제로
// 분으로 전부 치환해서 풀어보자
// 반복문으로만 풀어야한다는 오류를 범했다