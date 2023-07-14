import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int X = Integer.parseInt(br.readLine());
		int s = 0, e = N-1, cnt = 0;
		while(s<e) {
			if(arr[s] + arr[e] == X) {
				cnt++;
				s++;
				e--;
			} 
			else if(arr[s] + arr[e] > X) e--; 
			else s++;
		}
		System.out.println(cnt);
	}
}