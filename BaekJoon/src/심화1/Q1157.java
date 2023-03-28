package 심화1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1157 {
	static BufferedReader br;
	static BufferedWriter bw;
	static String str;
	static int[] arr;
	static int max, maxx, index;
	static char code;

	public static void main(String[] args) throws IOException {
		input();
		mainlogic();
	}
	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		arr = new int[26];
	}
	static void mainlogic() throws IOException {
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int strsize = str.length();
		int local = 0;
		for(char ch : str.toCharArray()) {
			int cnt = 0;
			if(ch < 91) { // 대문자인지
				ch += ' ';
			}
			local = ch - 'a';
			for(int i = 0; i < strsize; i++) { //카운트 하기 위한 반복문
				if(ch == str.charAt(i) || ch == (char)(str.charAt(i) + ' ') ) {
					arr[local] = ++cnt;
				}
			} // 카운트 반복문의 종
			if(max < arr[local]) {
				max = arr[local];
				code = (char)(local + 'A');
				index = local;
			}else if(local != index && max == arr[local]) {
				maxx = arr[local]; // 같은 알파벳 끼리 비교를 함
			}	
		}// for문 종료
		if(max != maxx) {
			bw.write(code);
		}else {
			bw.write('?');
		}
		bw.close();
	}
} // 되긴 됨 근데 시간이 오래걸림
// 30, 35 if문의 중복이 있어서 속도가 좀 느려졌음 
// 그리고 너무 빙빙 구구절절 코딩했음