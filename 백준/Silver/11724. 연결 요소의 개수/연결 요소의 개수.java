import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int result;
	static boolean[][] graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		graph = new boolean[N + 1][N + 1];
		visited = new boolean[N + 1];

		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph[start][end] = true;
			graph[end][start] = true;
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i]) continue;
			result++;
			dfs(i);
		}

		System.out.print(result);
	}

	static void dfs(int start) {
		visited[start] = true;

		for (int i = 1; i <= N; i++) {
			if (graph[start][i] && !visited[i]) dfs(i);
		}
	}
}
