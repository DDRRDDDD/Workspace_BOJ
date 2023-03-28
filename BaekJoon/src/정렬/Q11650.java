package 정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] cnt = new int[200001];
		int[] x = new int[n];
		int[] y = new int[n];
		String[] xy = new String[n];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
			cnt[x[i] + 100000]++;
		}
		for(int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}
		for(int i = x.length - 1; i >= 0; i--) {
			int value = x[i] + 100000;
			cnt[value]--;
			xy[cnt[value]] = String.valueOf(x[i]) + " " + String.valueOf(y[i]);
		}
		for(int i = 0 ; i < n; i++) {
			st = new StringTokenizer(xy[i]);
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		int point = x[0];
		int index = 0;
		int tmp = 0;
		out : while(true) {
			while(point == x[index]) {			
				if(index == n - 1) {
					index++;
					Arrays.sort(y, tmp, index);
					break out;
				}
				index++;
			}
			Arrays.sort(y, tmp, index);
			point = x[index]; //
			tmp = index;
		}
		for(int i = 0; i < n; i++) {
			bw.write(String.valueOf(x[i]) + " " + String.valueOf(y[i]) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
// while에서 비교했을 때 컸으므로 index가 +1 증가 한 상태 왔음 그런데 우리가 필요한거는 같은 숫자
// 그러므로 -1을 해주어서 같은 숫자가 연속해서 마지막에 있는 인덱스 배열을 구해주자
// 포인트를 수정 해주기 전에 기본 포인트 값 x[0]의 값으로 y 값 비교 를 위한 배열의 시작으로 사
// 그 후 배열 시작 부터 index -1 한 y의 값을 정렬 해주자(귀찮으니까 sort 메서드 사용하자)
// 그 다음 비교를 시작 하면 숫자가 증가한 point를 시작으로 다시 y 값을 정렬해주자

// Arrays.sort(int[],fromIndex(포함),toIndex(제외) )
// 범위가 0이면 걍 출력한다