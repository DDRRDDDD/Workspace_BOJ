package 재귀;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q24060 {

	static int k;
	static int[] arr, tmp;
	static int count = 0;
	static int result = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[n];
		tmp = new int[n];

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}	
		mergeSort(0, n - 1);
		bw.write(result + "");
		bw.close();
	}
	public static void mergeSort(int start, int end) {
		int mid;
		if(start < end) {
			mid = (start + end) / 2; 
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			merge(start, end, mid);

		}
	}
	public static void merge(int start, int end, int mid) {
		int i = start;
		int j = mid + 1;
		int t = 0;

		while(i <= mid && j <= end) {
			if(arr[i] <= arr[j]) 
				tmp[t++] = arr[i++]; 
			else 
				tmp[t++] = arr[j++];
		}
		while(i <= mid)
			tmp[t++] = arr[i++];
		while(j <= end)
			tmp[t++] = arr[j++];

		i = start;
		t = 0;

		while(i <= end) {
			arr[i++] = tmp[t++];
			count++;
			if(count == k) {
				result = arr[i - 1];
			}
		}
	}
}