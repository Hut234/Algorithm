import java.io.*;
import java.util.*;
class Main {
	static int N, MIN = Integer.MAX_VALUE;
	static int[] COST;
	static boolean[] VISITED;
	static int[][] DISCOUNT;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		COST = new int[N];
		VISITED = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) COST[i] = Integer.parseInt(st.nextToken());
		DISCOUNT = new int[N][N];
		int size;
		for(int i=0; i<N; i++) {
			size = Integer.parseInt(br.readLine());
			for(int j=0; j<size; j++) {
				String[] info = br.readLine().split(" ");
				DISCOUNT[i][Integer.parseInt(info[0])-1] = Integer.parseInt(info[1]);
			}
		}
		recur(0, 0);
		System.out.println(MIN);
	}
	private static void recur(int idx, int sum) {
		if(idx == N) {
			MIN = Integer.min(MIN, sum);
			return;
		}
		for(int i=0; i<N; i++) {
			int tmp;
			if(VISITED[i]) continue;
			VISITED[i] = true;
			
			if(COST[i] > 0) tmp = COST[i];
			else tmp = 1;
			
			for(int p=0; p<N; p++) COST[p] -= DISCOUNT[i][p];
			recur(idx+1, sum+tmp);
			for(int p=0; p<N; p++) COST[p] += DISCOUNT[i][p];
			VISITED[i] = false;
		}
	}
}