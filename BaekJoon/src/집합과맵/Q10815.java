package 집합과맵;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q10815 {
    
    static int myArr[];
    static int cardArr[];
    
     public static int logic(int key,int start, int end) {
		int mid;
		
		if(start <= end) {
			mid = (start + end) / 2;
			
			if(key == myArr[mid]) {
				return 1;
			}else if(key < myArr[mid]) {
				return logic(key, start, mid - 1);
			}else {
				return logic(key, mid + 1, end);
			}
		}
		return 0;
	}
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// input
		int n = Integer.parseInt(br.readLine());
		myArr = new int[n];

		st = new StringTokenizer(br.readLine());
      
		for(int i = 0; i < n; i++) { 
			myArr[i] = Integer.parseInt(st.nextToken());
			
		}
		int m = Integer.parseInt(br.readLine());
		cardArr = new int[m];

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			cardArr[i] = Integer.parseInt(st.nextToken());
		}

        
        Arrays.sort(myArr);
        for(int i : cardArr){
            int result = logic(i, 0, myArr.length -1);
            bw.write(result + " ");
        }	
		bw.close();

	}
}