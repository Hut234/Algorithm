import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

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
		Queue<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[]{start, 0});
		visited[start] = true;

		int answer = -1;
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			if (current[0] == end) {
				answer = current[1];
				break;
			}
			for (int next : relations[current[0]]) {
				if (visited[next]) continue;
				queue.offer(new int[]{next, current[1] + 1});
				visited[next] = true;
			}
		}
		System.out.print(answer);
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