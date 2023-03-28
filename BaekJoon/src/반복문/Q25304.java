package 반복문;
import java.util.Scanner;

public class Q25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = sc.nextInt(); // 총금액
		int t = sc.nextInt(); //제품 종류의 개수
		int[] price = new int[t];
		int[] cnt = new int[t];
		int sum = 0;

		for(int i = 0; i < t; i++) {
			price[i] = sc.nextInt();
			cnt[i] = sc.nextInt();
			sum += (price[i] * cnt[i]);		
		}
		sc.close();
		if(result == sum && t == price.length) {
			System.out.println("Yes");
		}else {
			System.out.println("No");			
		}
	}
}
