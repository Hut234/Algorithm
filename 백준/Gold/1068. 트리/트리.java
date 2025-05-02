import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	static int n;
	static boolean[] visited;
	static int result;
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
		visited = new boolean[n];
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
		dfs(root);
		print();
	}

	static void dfs(int parent) {
		if (parent == remove) return;
		visited[parent] = true;

		for (int child : graph[parent]) {
			if (visited[child]) continue;
			dfs(child);
		}

		if (graph[parent].isEmpty()) result++;
	}

	static void print() {
		System.out.print(result);
	}
}