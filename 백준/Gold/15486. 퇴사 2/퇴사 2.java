import java.io.*;
import java.util.*;
class Main {
	private static int[] DP;
	private static int[][] INFO;
	private static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		DP = new int[N+1000];
		INFO = new int[N][2];
		for(int i=0; i<N; i++) {
			String[] info = br.readLine().split(" ");
			INFO[i][0] = Integer.parseInt(info[0]);
			INFO[i][1] = Integer.parseInt(info[1]);
		}
		Arrays.fill(DP, N+1, DP.length, Integer.MIN_VALUE);
		for(int i=N-1; i>-1; i--) {
			DP[i] = Integer.max(DP[i+INFO[i][0]]+INFO[i][1], DP[i+1]);
		}
		System.out.println(DP[0]);
	}
}