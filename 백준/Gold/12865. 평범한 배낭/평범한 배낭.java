import java.io.*;
class Main {
	private static int N, K;
	private static int[][] DP;
	private static int[][] INFO;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		K = Integer.parseInt(str[1]);
		DP = new int[N][100001];
		INFO = new int[N][2];
		for(int i=0; i<N; i++) {
			String[] info = br.readLine().split(" ");
			INFO[i][0] = Integer.parseInt(info[0]);
			INFO[i][1] = Integer.parseInt(info[1]);
		}
		recur(0, 0);
		System.out.print(DP[0][0]);
	}
	private static int recur(int idx, int weight) {
		if(weight>K) return Integer.MIN_VALUE;
		if(idx==N) return 0;
		if(DP[idx][weight]!=0) return DP[idx][weight];
		return DP[idx][weight] = Integer.max(recur(idx+1, weight+INFO[idx][0])+INFO[idx][1], recur(idx+1, weight));
	}
}