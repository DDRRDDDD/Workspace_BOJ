package 스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String input = br.readLine();
			if(input.equals("."))
				break;
			
			int index = 0;
			String[] tmp = new String[input.length()];
			Arrays.fill(tmp, "");
			
			for(int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if(ch != '(' && ch != ')' && ch != ']' && ch != '[')
					continue;
				
				String str = String.valueOf(ch);
				if(str.equals("(") || str.equals("[")) {
					tmp[index] += str;
					index++;
				}else {
					index--;
					index = index < 0 ? 0 : index;
					tmp[index] += str; 
				}
			}
			boolean bol = true;
			for(int i = 0; i < input.length(); i++) {
				if(tmp[i].equals(""))
					break;
				
				tmp[i] = tmp[i].replace("()", "");
				tmp[i] = tmp[i].replace("[]", "");
				
				if(!tmp[i].equals("")) {
					bol = false;
					break;
				}
			}
			String result = bol ? "yes" : "no";
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}
