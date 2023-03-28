package 재귀;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4779 {

	private static String logic(int depth, String line) {
		if(depth == 0)
			return line;

		StringBuilder sb = new StringBuilder(line);
		for(int j = 0; j < line.length(); j++)
			sb.append(" "); 
		sb.append(line);

		return logic(depth-1, sb.toString());	
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;
		while((str = br.readLine()) != null) {
			String result = logic(Integer.parseInt(str), "-");
			System.out.println(result);
			str = null;
		}
	}

}
