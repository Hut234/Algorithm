import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), size;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			size = Integer.parseInt(st.nextToken());
			int[] arr = new int[size];
			int sum = 0;
			for(int i=0; i<size; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			int avg = sum/size;
			int cnt = 0;
			for(int i=0; i<size; i++) if(arr[i]>avg) cnt++;
			sb.append(Math.round(((double)cnt/size)*100000) /1000.0).append("%").append("\n");
		}
		System.out.println(sb.toString());
	}
}