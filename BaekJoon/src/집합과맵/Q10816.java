package 집합과맵;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			
			//겟 오어 디폴트 메소드의 두번째 매개 변수에 0을 지정 해줌으로서 해당 key의 값이 없으면 0을 반환한다
			// 반대로 있으면 해당 key의 node의 객체를 반환하는데 계속해서 해당 key의 value를 확인하면서
			// 아래와 같은 증강 식을 만들 수 있다.
			
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
				
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			
			//마찬가지로 키 값이 존재하지 않으면 0을 반환하게 하여 존재하지 않는 value의 값을 0으로 디폴트 할 수 있
			bw.write(map.getOrDefault(key, 0) + " ");
		}
		bw.close();
	}
}

// 참고 : https://st-lab.tistory.com/267