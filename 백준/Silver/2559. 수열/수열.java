import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N+1];
		int idx = 1;
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			arr[idx] = arr[idx-1] + Integer.parseInt(st.nextToken());
			idx++;
		}
		
		int max = -10000001;
		for (int i = K; i <= N; i++) {
			max = Integer.max(max, (arr[i]-arr[i-K]));
		}
		
		System.out.print(max);
	}

}
