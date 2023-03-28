package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class Q10951R {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		String str;

		while((str = br.readLine()) != null) {	
			try {
				st = new StringTokenizer(str);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write((a + b) + "\n");
			}catch(NoSuchElementException e) {
				break;
			}
		}
		br.close();
		bw.close();
	}
}

// NoSuchElementException 이 발생 
// 예외 처리로 마감
// 알고리즘 2022/10/21 참고