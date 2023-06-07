import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 9;
		int[] arr = new int[N];
		int sum = 0;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(sum-(arr[i]+arr[j]) == 100) {
					for(int p=0; p<N; p++) {
						if(p==i||p==j) continue;
						System.out.println(arr[p]);
					}
                    return;
				}
			}
		}
		
	}
}