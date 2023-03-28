package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2108R {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] cntArray = new int[8001]; // -4000 ~ 4000
		int sum = 0;
		int max = Integer.MIN_VALUE; // 최대값
		int min = Integer.MAX_VALUE; // 최소값
		int mid = 0; // 중앙값
		int freq = 0; // 최빈값

		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			cntArray[num + 4000]++;
			sum += num;
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		int cnt = 0; // 빈도수
		int freqCount = 0; // 최대 빈도 수
		boolean flag = false;

		for(int i =min + 4000; i <= max + 4000; i++) {
			if(cnt < (n + 1) / 2) {
				cnt += cntArray[i];
				mid = i - 4000;
			}
			if(freqCount < cntArray[i]) {
				freqCount = cntArray[i];
				freq = i - 4000;
				flag = true;
			}else if(freqCount == cntArray[i] && flag == true) {
				freq = i - 4000;
				flag = false;
			}
		}
		bw.write((int)Math.round((double)sum / n)+ "\n"); // 평균값
		bw.write(mid + "\n"); // 중앙값
		bw.write(freq + "\n"); // 최빈값
		bw.write((max - min) + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}