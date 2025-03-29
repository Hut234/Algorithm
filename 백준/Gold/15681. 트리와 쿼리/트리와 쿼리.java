import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int[] counts;
	static boolean[] visited;
	static List<Integer>[] graph;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NRQ =  br.readLine().split(" ");
		int N = Integer.parseInt(NRQ[0]);
		int R = Integer.parseInt(NRQ[1]);
		int Q = Integer.parseInt(NRQ[2]);

		counts = new int[N + 1];
		visited = new boolean[N + 1];
		graph = new List[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		StringTokenizer st;
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			graph[start].add(end);
			graph[end].add(start);
		}

		Arrays.fill(counts, 1);
		dfs(R);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			int q = Integer.parseInt(br.readLine());
			sb.append(counts[q]).append("\n");
		}

		System.out.print(sb);
	}

	static void dfs(int parent) {
		visited[parent] = true;

		for (int child : graph[parent]) {
			if (!visited[child]) {
				dfs(child);
				counts[parent] += counts[child];
			}
		}
	}
}
