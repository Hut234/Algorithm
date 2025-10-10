import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int answer = 10000001;
	static boolean[] visited;
	static int[][] costs;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	private static void solve() {
		for (int i = 0; i < N; i++) {
			visited[i] = true;
			dfs(0, i, i, 0);
			visited[i] = false;
		}
		System.out.print(answer);
	}

	private static void dfs(int depth, int first, int start, int totalCost) {
		if (answer <= totalCost) return;

		if (depth == N - 1) {
			if (costs[start][first] == 0) return;
			answer = Integer.min(answer, totalCost + costs[start][first]);
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i] || costs[start][i] == 0) continue;
			visited[i] = true;
			dfs(depth + 1, first, i, totalCost + costs[start][i]);
			visited[i] = false;
		}
	}

	private static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
        visited = new boolean[N];

		StringTokenizer st;
		costs = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				costs[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
}