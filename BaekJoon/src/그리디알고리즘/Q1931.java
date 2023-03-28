package 그리디알고리즘;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
 				if(o1[1] == o2[1])
 					return o1[0] - o2[0];
 				else 
 					return o1[1] - o2[1];
			}
		});
		
		int cnt = 0;
		
		// 배열의 첫번째 인덱스와 비교하는게 아니고 아예 0 부터 비교를 해야 정확함
		int compare = 0;
		for(int i = 0; i < n; i++) {
			if(compare <= arr[i][0]) {
				compare = arr[i][1];
				cnt++;					
			}
		}
		System.out.print(cnt);
	}
}

