package 일차원배열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		double total = 0;
		double avg = 0;
		
		ArrayList<Integer> score = new ArrayList<>();
		ArrayList<Double> fake = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) { // 점수를 integer 형으로 담기
			score.add(i, Integer.parseInt(st.nextToken()));
			if(score.get(i) > max) {
				max = score.get(i);
			}
		}
		for(int i = 0; i < n; i++) {// 가짜 점수를 double 형으로 담아 총점을 구하기
			fake.add(i, ((score.get(i) / (double)max) * 100)); // max를 double로 형변환
			total += fake.get(i);
		}
		avg = total / n;
		bw.write(avg + "");
		bw.close();
	}
}
