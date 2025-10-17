import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

	static int N;
	static int M;
	static int V;
	static List<Integer>[] graph;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	private static void solve() {
		visited = new boolean[N + 1];
		dfs(V);
		sb.append("\n");

		visited = new boolean[N + 1];
		bfs(V);
		System.out.print(sb);
	}

	private static void bfs(int start) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int current = queue.poll();
			sb.append(current).append(" ");
			for (int next : graph[current]) {
				if (visited[next]) continue;
				queue.offer(next);
				visited[next] = true;
			}
		}

	}

	private static void dfs(int current) {
		sb.append(current).append(" ");
		visited[current] = true;
		for (int next : graph[current]) {
			if (visited[next]) continue;
			dfs(next);
		}
	}

	private static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		graph = new List[N + 1];
		for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph[start].add(end);
			graph[end].add(start);
		}

		for (int i = 1; i <= N; i++) Collections.sort(graph[i]);
	}
}