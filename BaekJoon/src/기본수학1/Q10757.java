package 기본수학1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String num1 = st.nextToken();
		String num2 = st.nextToken();
		String big = "";
		String small = "";
		
		if(num1.length() >= num2.length()) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
				
		
		int bigSize = big.length();
		int smallSize = small.length();
		
		int[] arr = new int[bigSize]; // 작은넘, 배열 큰배열 안에 오른쪽 밀착
		
		for(int i = bigSize - smallSize, j = 0; i < bigSize; i++) {
			arr[i] = (small.charAt(j++) - '0');	
		}
		
		for(int i = bigSize - 1; i >= 0; i--) {
				arr[i] += big.charAt(i) -'0';
				if(i == 0) {
					break;
				}
				if(arr[i] > 9) { // 합의 크기 10 보다 클 때
					arr[i - 1] += 1;
					arr[i] = arr[i] % 10;
				}
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "");			
		}
		bw.close();
	}
}
