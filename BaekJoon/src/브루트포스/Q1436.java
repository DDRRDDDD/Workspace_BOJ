package 브루트포스;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1436 {
	
	static final String six = "666";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		long num = 666;
		int cnt = 0;
		long result = 0;
		
		while(cnt < n) {
			String incNum = Long.toString(num);
			
			for(int i = 0; i < incNum.length() - 2; i++) {
				if(incNum.substring(i, i + 3).equals(six))
					cnt++;
					result = num;
			}
			num++;
		}
		bw.write(result + "");
		bw.close();
	}
}

// 메모리 초과
// 불가변 객체 String이 마구 생성 되므로 메모리가 초과되는 것 같다 Stringbuilder 나 Stringbuffer를 사용하자
