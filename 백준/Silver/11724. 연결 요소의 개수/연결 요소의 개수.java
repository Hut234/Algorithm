import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int result;
	static List<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		graph = new List[N + 1];
		visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			graph[start].add(end);
			graph[end].add(start);
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i]) continue;
			bfs(i);
		}

		System.out.print(result);
	}

	static void bfs(int start) {
		result++;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;


		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int next : graph[cur]) {
				if (visited[next]) continue;
				queue.offer(next);
				visited[next] = true;
			}
		}
	}
}
