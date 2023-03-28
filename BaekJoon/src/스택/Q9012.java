package 스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][];;

		for(int i = 0; i < n; i++) {
			int index = 0;
			String input = br.readLine();
			arr[i] = new String[input.length()];
			Arrays.fill(arr[i], "");
			for(int j = 0; j < input.length(); j++) {
				String ch = input.charAt(j) + "";
				if(ch.equals("(")) {
					arr[i][index] += ch;
					index++;
				}else{
					index--;
					index = index < 0 ? 0 : index;
					arr[i][index] += ch;
				}
			}
		}// for문 끝
		
		for(int i = 0; i < n; i++) {
			boolean isTrue = true;
			for(int j = 0 ; j < arr[i].length; j++) {
				String str = arr[i][j];
				if(str.equals(""))
					break;
				
				str = str.replace("()", "");
				if(!str.equals("")) {
					isTrue = false;
					break;
				}
			}
			
			if(isTrue) System.out.println("YES");
			else 	   System.out.println("NO");
		}
	}

}
/*	
 * 시발 이 쉬운거를
 * 
 * 		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i=0;i<t;i++) {
			String str = s.next();

			int cnt = 0;
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='(') cnt++;
				else cnt--;
				if(cnt < 0) break;
				
			}
			
		if(cnt == 0) 
			System.out.println("YES");
		else 
			System.out.println("NO");
			
		}
		s.close();
 */
