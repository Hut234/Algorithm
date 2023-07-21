import java.io.*;
import java.util.*;
class Main {
	private static int[] DP;
	private static int[][] INFO;
	private static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		DP = new int[N];
		INFO = new int[N][2];
		for(int i=0; i<N; i++) {
			String[] info = br.readLine().split(" ");
			INFO[i][0] = Integer.parseInt(info[0]);
			INFO[i][1] = Integer.parseInt(info[1]);
		}
		recur(0);
		Arrays.sort(DP);
		System.out.println(DP[DP.length-1]);
	}
	
	private static int recur(int idx) {
		if(idx==N) return 0;
		if(idx>N) return Integer.MIN_VALUE;
		if(DP[idx]!=0) return DP[idx];
		return DP[idx] = Integer.max(recur(idx+INFO[idx][0])+INFO[idx][1], recur(idx+1));
	}
}