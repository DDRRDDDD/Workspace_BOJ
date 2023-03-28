package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10952R {
/*
1 1
2 3
3 4
9 8
5 2
30 40
35 50
30 37
35 40
0 0
 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str;

		for(;;) {
			str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
//			String a = str.nextToken();
//			String b = str.nextToken();
//			if(a.equals( "0") && b.equals( "0")) {
			if(a ==0 && b == 0) {
				break;
			}else {
				bw.write((a + b));
//				bw.newLine();
//				System.out.print(a + b);
			}
		}

		bw.close();
	} 
}
