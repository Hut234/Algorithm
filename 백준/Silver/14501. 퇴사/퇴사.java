import java.io.*;
import java.util.*;
class Main {
	static int[][] ARR;
	static int N, result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		ARR = new int[N+1][2];
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			ARR[i][0] = Integer.parseInt(st.nextToken());
			ARR[i][1] = Integer.parseInt(st.nextToken());
		}
		recur(1, 0);
		System.out.println(result);
	}
	private static void recur(int idx, int sum) {
		if(idx > N+1) return;
		if(idx == N+1) {
			result = Integer.max(result, sum);
			return;
		}
		recur(idx+ARR[idx][0], sum+ARR[idx][1]);
		recur(idx+1, sum);
	}
}