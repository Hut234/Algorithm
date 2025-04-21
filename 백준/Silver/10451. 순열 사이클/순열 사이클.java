import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] graph;
	static boolean[] visited;
	static int N;
	static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (T-- > 0) {
			N = Integer.parseInt(br.readLine());
			graph = new int[N + 1];
			visited = new boolean[N + 1];
			result = 0;

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				int end = Integer.parseInt(st.nextToken());
				graph[i] = end;
			}

			for (int i = 1; i <= N; i++) {
				if (visited[i]) continue;
				visited[i] = true;
				dfs(i);
			}
			sb.append(result).append("\n");
		}

		System.out.print(sb);
	}

	static void dfs(int next) {
		if (visited[graph[next]]) {
			result++;
			return;
		}

		visited[graph[next]] = true;
		dfs(graph[next]);
	}
}
