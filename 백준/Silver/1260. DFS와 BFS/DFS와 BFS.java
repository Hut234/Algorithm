import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int[][] graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NMV = br.readLine().split(" ");
		N = Integer.parseInt(NMV[0]);
		M = Integer.parseInt(NMV[1]);
		int V = Integer.parseInt(NMV[2]);

		StringTokenizer st;
		graph = new int[N + 1][N + 1];
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph[start][end] = 1;
			graph[end][start] = 1;
		}

		visited = new boolean[N + 1];
		dfs(V);
		sb.append("\n");
		visited = new boolean[N + 1];
		bfs(V);

	    System.out.print(sb);
	}

	static void dfs(int start) {
		visited[start] = true;
		sb.append(start).append(" ");

		for (int i = 1; i <= N; i++) {
			if (!visited[i] && graph[start][i] == 1) {
				dfs(i);
			}
		}
	}

	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			sb.append(cur).append(" ");
			for (int i = 1; i <= N; i++) {
				if (!visited[i] && graph[cur][i] == 1) {
					visited[i] = true;
					queue.offer(i);
				}
			}
		}
	}
}
