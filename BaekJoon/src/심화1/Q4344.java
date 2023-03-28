package 심화1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st;
		int c = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < c; i++) {// 케이스의 길이 c 만큼 돌릴 반복문
			int total = 0;
			int cnt = 0; // 퍼센트 구할 때 소수점 구하기 위함
			int avg = 0;
			st = new StringTokenizer(br.readLine());
			arr.add(0,Integer.parseInt(st.nextToken()));

			for(int j = 1; j <= arr.get(0); j++) { 			
				arr.add(j, Integer.parseInt(st.nextToken()));
				total += arr.get(j);
			}
			avg = total / arr.get(0);
			for(int k = 1; k <= arr.get(0); k++) {
				if(avg < arr.get(k)) {
					cnt++;
				}
			}
			double per = ((double)cnt/ arr.get(0)) * 100.0;
			String s = String.format("%.3f", per);
			bw.write(s + "%" + "\n");
		}
		bw.close();
	}
}