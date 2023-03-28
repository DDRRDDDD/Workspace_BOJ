package 약수_배수와소수2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1735 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] frac1 = new int[2];
		int[] frac2 = new int[2];
		
		st = new StringTokenizer(br.readLine());
		frac1[0] = Integer.parseInt(st.nextToken());
		frac1[1] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		frac2[0] = Integer.parseInt(st.nextToken());
		frac2[1] = Integer.parseInt(st.nextToken());
		
		int a = frac1[1] * frac2[1];
		int b = frac1[0] * frac2[1] + frac2[0] * frac1[1];
		
		int big = a >= b ? a : b;
		int small = big==a ? b : a;
		
		int min = 0;
		while(true) {
			int tmp = small;
			small = big % small;
			big = tmp;
			
			if(small == 0) {
				min = big;
				break;
			}
		}
		a /= min;
		b /= min;
		System.out.println(b +" "+ a);

	}

}
