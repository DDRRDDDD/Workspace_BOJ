package 문자열;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q10809R {

	static BufferedReader br;
	static BufferedWriter bw;
	static String st;
	static char ch;
	static ArrayList<Integer> arr;
	
	public static void main(String[] args) throws IOException {
		array();
		input();
		logic();
		output();
	}
	static void array() {
		arr = new ArrayList<>(26);
		for(int i = 0; i < 26; i++) {
			arr.add(i, -1);
		}
	}
	static void input() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = br.readLine();
	}
	static void logic() throws IOException {
		for(int i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			if(arr.get(ch - 'a') == -1) {
				arr.set(ch - 'a', i);
			}
		}
	}
	static void output()throws IOException {
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int result : arr) {
			bw.write(result + " ");
		}
		bw.close();
	}
}
// 클래스 내에서 메서드 만으로 매인 돌려보기