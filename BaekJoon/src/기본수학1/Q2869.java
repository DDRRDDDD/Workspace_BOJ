package 기본수학1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int result = (h - up) / (up - down); // 하루를 제외하고 올라간 일 수
		int tmp = (h - up) % (up - down); 	 // 딱 맞게 올라갔는지 확인하기 위한 변수
											 // 0 보다 높으면 하루를 더 갈 수 있다 
		if(tmp == 0) { 						
			bw.write((result + 1) + "");     // 하루를 제외 했으므로 하루를 다시 더해 준다
		}else {							    
			bw.write((result + 2) + "");	// tmp 값이 0보다 높기에 초과해서 넘어간 하루 & 제외한 하루
		}									// 총 이틀을 더해준다
		bw.close();
	}
}
