package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2477 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr= new int[6][2];
		int n = Integer.parseInt(br.readLine());
		int longW = 0;
		int longH = 0;
		int shortW = 0;
		int shortH = 0;
		int big = 0;
		int small = 0;
		
		int longWidthIndex = 0;
		int longHeightIndex = 0;
		
		StringTokenizer st;
		for(int i = 0 ; i < 6; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 큰 사각형의 가로 새로 구하는 식
		if(arr[0][0] == 1 || arr[0][0] == 2) {// 만약 가로 라면
			longW = arr[0][1];
			longH = arr[1][1];
			longWidthIndex = 0;
			longHeightIndex = 1;
		}else {
			longW = arr[1][1];
			longH = arr[0][1];
			longWidthIndex = 1;
			longHeightIndex = 0;
		}
		for(int i = 1; i < 6; i++) {			
			if(arr[i][0] < 3 && arr[i][1] > longW) {
				longW = arr[i][1];
				longWidthIndex = i;
			}
			if(arr[i][0] > 2 && arr[i][1] > longH) {
				longH = arr[i][1];
				longHeightIndex = i;
			}
		}		
		big = longH * longW;
		
		// 작은 사격형의 가로 세로 구하는 식
		int right = 0;
		int left = 0;
		
		if(longWidthIndex == 5)
			right = 0;
		else
			right = longWidthIndex + 1;
		if(longWidthIndex == 0)
			left = 5;
		else
			left = longWidthIndex - 1;
		
		shortW = arr[left][1] - arr[right][1];
		
		if(longHeightIndex == 5)
			right = 0;
		else
			right = longHeightIndex + 1;
		if(longHeightIndex == 0)
			left = 5;
		else
			left = longHeightIndex - 1;
		
		shortH = arr[left][1] - arr[right][1];
		
		small = Math.abs(shortH) * Math.abs(shortW);
		
		bw.write((big - small) * n + "");
		bw.close();
	}
}