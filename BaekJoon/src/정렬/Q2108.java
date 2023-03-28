package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer>freq = new ArrayList<>();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] cnt = new int[8001];
		int index = 0;
		double sum = 0;
		int max = 0;

		for(int i = 0; i < n; i++) { // 카운트 배열 입력
			cnt[4000 + Integer.parseInt(br.readLine())]++;
		}
		br.close();

		for(int i = 0; i < cnt.length; i++) { // 최빈값
			if(cnt[i] != 0 && cnt[i] > max) {
				max = cnt[i];
			}
		}

		for(int i = 0; i < cnt.length; i++) { // 카운트 정렬 겸 최빈 배열 저장
			if(max == cnt[i]) {
				freq.add(i - 4000);
			}
			while(cnt[i] > 0) {
				arr[index++] = i - 4000;
				sum += i - 4000;
				cnt[i]--;
			}
		}
		
		String avg = String.format("%.0f", (sum / n)); // 평균값
		
		bw.write(Integer.parseInt(avg) + "\n"); // 평균result
		bw.write(arr[n / 2] + "\n"); // 중앙result	
		if(freq.size() > 1) { // 최빈 result
			bw.write(freq.get(1) + "\n");			
		}else {			
			bw.write(freq.get(0) + "\n");			
		}
		bw.write((arr[arr.length -1] - arr[0]) + "\n"); // 범위result
		bw.close();
	}
}
