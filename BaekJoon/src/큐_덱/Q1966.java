package 큐_덱;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int a = 0; a < n; a++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			int target = 0;
			
			Integer[] tier = new Integer[m];
			LinkedList<int[]> arr = new LinkedList<int[]>();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				int[] tmp = new int[2];
				tmp[0] = i;
				tmp[1] = Integer.parseInt(st.nextToken());
				tier[i] = tmp[1];
				arr.add(tmp);
				
				if(idx == i)
					target = tmp[1];
			}
			
			Arrays.sort(tier, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
			
			int cnt = 0;
			while(true) {
				int[] num = arr.poll();
				if(tier[cnt] == num[1]) {
					cnt++;
					if(idx == num[0] && target == num[1]) {
						sb.append(cnt).append("\n");
						break;
					}
					continue;
				}
				arr.add(num);
			}
		}
		System.out.println(sb);
	}
}
