import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(T-->0) {
			int[] arr = new int[10];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<10; i++) arr[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(arr);
			bw.write(arr[7] + "\n");
		}
		bw.flush(); bw.close();
	}
}