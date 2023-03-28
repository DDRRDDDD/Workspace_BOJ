package 반복문;
import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
		for(int j : arr) { // for(배열을 받을 변수 : 배열) 배열을 좌변에 저장해주세요~ 라는 뜻
			System.out.println(j);
		}
	}
}