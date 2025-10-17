import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	static int answer = -1;
	static boolean flag;
	static int n;
	static int m;
	static int start;
	static int end;
	static boolean[] visited;
	static List<Integer>[] relations;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	private static void solve() {
		dfs(start, 0);
		System.out.print(answer);
	}

	private static void dfs(int current, int count) {
		if (current == end) {
			answer = count;
			flag = true;
		}
		if (flag) return;
		visited[current] = true;
		for (int next : relations[current]) {
			if (visited[next]) continue;
			dfs(next, count + 1);
		}
	}


	private static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());
		visited = new boolean[n + 1];

		relations = new List[n + 1];
		for (int i = 1; i <= n; i++) {
			relations[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			relations[parent].add(child);
			relations[child].add(parent);
		}
	}
}