import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	static int n;
	static int[] dp;
	static int root;
	static int remove;
	static List<Integer>[] graph;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n];
		graph = new List[n];

		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}

		StringTokenizer st = new StringTokenizer(br.readLine());
		remove = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int parent = Integer.parseInt(st.nextToken());
			if (parent == -1) {
				root = i;
				continue;
			}
			if (i == remove || parent == remove) continue;

			graph[parent].add(i);
		}
	}

	static void solve() {
		print(dfs(root));
	}

	static int dfs(int parent) {
		if (parent == remove) return 0;

		if (graph[parent].isEmpty()) {
			return dp[parent] = 1;
		}

		for (int child : graph[parent]) {
			dp[parent] += dfs(child);
		}
		return dp[parent];
	}

	static void print(int result) {
		System.out.print(result);
	}
}