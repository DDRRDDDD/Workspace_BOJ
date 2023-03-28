package 분할_정복;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 참고 https://st-lab.tistory.com/245
// 감사합니다 ㅎㅅㅎ7
public class Q2740 {
	
	private static void merge(int[][] d, int[][] m, int row, int col, int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				m[i+row][j+col] = d[i][j];
			}
		}
	}
	
	private static int[][] cal(int[][] a, int[][] b, int size, boolean bool){
		int op = bool ? 1 : -1;
		int[][] c = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				c[i][j] = a[i][j] + b[i][j] * op;
			}
		}
		return c;
	}
	
	private static int[][] extraction(int[][] arr, int row, int col, int size) {
		int[][] tmp = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				tmp[i][j] = arr[row+i][col+j];
			}
		}
		return tmp;
	}
	
	// 메서드에 선언하는 임시 배열들이 많기 때문에 너비가 넓어 질 수록 오버헤드가 발생함
	// 메모리 초과로 계산 단위가 비교적 적게 떨어지는 예) 100번정도 시간이 그렇게 오래 걸리지 않기 때문에 반복문 대체
	private static int[][] loop(int[][] a, int[][] b, int size){
		int[][] tmp = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				for(int k = 0; k < size; k++) {
					tmp[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return tmp;
	}
	
	private static int[][] multiply(int[][] a, int[][] b, int size) {
		
		int[][] c = new int[size][size];
		
		//임계값
		if(size <= 16) {
			return c = loop(a, b, size);
		}
		
		int width = size/2;
		
		// 슈트라센 알고리즘 참고하세요
		// 참고 하라고 ㅋㅋ
		int[][] a11 = extraction(a, 0, 0, width);
		int[][] a12 = extraction(a, 0, width, width);
		int[][] a21 = extraction(a, width, 0, width);
		int[][] a22 = extraction(a, width, width, width);

		int[][] b11 = extraction(b, 0, 0, width);
		int[][] b12 = extraction(b, 0, width, width);
		int[][] b21 = extraction(b, width, 0, width);
		int[][] b22 = extraction(b, width, width, width);
		
		int[][] m1 = multiply(cal(a11, a22, width, true), cal(b11, b22, width, true), width);
		int[][] m2 = multiply(cal(a21, a22, width, true), b11, width);
		int[][] m3 = multiply(a11, cal(b12, b22, width, false), width);
		int[][] m4 = multiply(a22, cal(b21, b11, width, false), width);
		int[][] m5 = multiply(cal(a11, a12, width, true), b22, width);
		int[][] m6 = multiply(cal(a21, a11, width, false), cal(b11, b12, width, true), width);
		int[][] m7 = multiply(cal(a12, a22, width, false), cal(b21, b22, width, true), width);
		
		int[][] c11 = cal(cal(cal(m1, m4, width, true), m5, width, false), m7, width, true);
		int[][] c12 = cal(m3, m5, width, true);
		int[][] c21 = cal(m2, m4, width, true);
		int[][] c22 = cal(cal(cal(m1, m2, width, false), m3, width, true), m6, width, true);
		
		merge(c11, c, 0, 0, width);
		merge(c12, c, 0, width, width);
		merge(c21, c, width, 0, width);
		merge(c22, c, width, width, width);		
		
		return c;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] a = new int[128][128];
		int[][] b = new int[128][128];
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < k; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int big = Math.max(Math.max(n, m), k);
		int width = 1;
		while(width < big)
			width *= 2;
		
		int[][] result = multiply(a, b, width);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
	}

}


