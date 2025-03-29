import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int result = Integer.MIN_VALUE;
	static int[][] ingredients;
	static boolean[] visited;
	static int n;
	static int k;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NK = br.readLine().split(" ");
		n = Integer.parseInt(NK[0]);
		k = Integer.parseInt(NK[1]);

		ingredients = new int[n][n];
		visited = new boolean[n];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				ingredients[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		System.out.println(result);
	}

	static void dfs(int depth) {
		if (depth == k) {
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				if (!visited[i]) continue;
				for (int j = i + 1; j < n; j++) {
					if (!visited[j]) continue;
					sum += ingredients[i][j];
				}
			}

			result = Integer.max(result, sum);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(depth + 1);
				visited[i] = false;
			}
		}

	}
}