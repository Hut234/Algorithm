import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int N;
	static int M;
	static boolean[][] relations;
	static boolean[][] visited;
	static int[][] distances;

	public static void main(String[] args) {
		getInput();
		solve();
	}

	static void solve() {
		for (int i = 1; i <= N; i++) {
			bfs(i);
		}

		int result = -1, min = Integer.MAX_VALUE;
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				if (i == j) continue;
				sum += distances[i][j];
			}
			if (sum < min) {
				min = sum;
				result = i;
			}
		}

		System.out.print(result);
	}

	static void bfs(int start) {
		visited = new boolean[N + 1][N + 1];
		visited[start][start] = true;
		Queue<Integer[]> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if (relations[start][i]) {
				queue.offer(new Integer[]{i, 1});
				visited[start][i] = true;
				distances[start][i] = 1;
			}
		}

		while (!queue.isEmpty()) {
			Integer[] cur = queue.poll();
			for (int i = 1; i <= N; i++) {
				int next = cur[0];
				int depth = cur[1];
				if (visited[start][i] || !relations[next][i]) continue;
				queue.offer(new Integer[]{i, depth + 1});
				visited[start][i] = true;
				distances[start][i] = depth + 1;
			}
		}
	}

	static void getInput() {
		N = sc.nextInt();
		M = sc.nextInt();
		relations = new boolean[N + 1][N + 1];
		distances = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			relations[s][e] = true;
			relations[e][s] = true;
		}
	}
}