package 스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		int index = 0;
		int[] arr = new int[k];
		
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
		
			if(num == 0) {
				arr[--index] = 0;
				index = index < 0 ? 0 : index;
				continue;
			}
			arr[index++] = num;	
		}
		
		int sum = 0;
		for(int i = 0; i < index; i++)
			sum += arr[i];
		
		System.out.print(sum);
	}

}
