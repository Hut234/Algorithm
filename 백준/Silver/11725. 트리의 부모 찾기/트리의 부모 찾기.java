import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	static StringBuilder sb = new StringBuilder();
	static int n;
	static boolean[] visited;
	static int[] result;
	static List<Integer>[] graph;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n + 1];
		result = new int[n + 1];
		graph = new List[n + 1];

		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}


		StringTokenizer st;
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			graph[parent].add(child);
			graph[child].add(parent);
		}
	}

	static void solve() {
		dfs(1);
		print();
	}

	static void dfs(int parent) {
		visited[parent] = true;

		for (int child : graph[parent]) {
			if (visited[child]) continue;
			result[child] = parent;
			dfs(child);
		}
	}

	static void print() {
		for (int i = 2; i <= n; i++) {
			sb.append(result[i]).append("\n");
		}
		System.out.print(sb);
	}
}