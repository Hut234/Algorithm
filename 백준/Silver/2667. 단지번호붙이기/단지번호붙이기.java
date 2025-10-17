import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

class Main {

	static int N;
	static char[][] map;
	static boolean[][] visited;
	static List<Integer> answer = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	private static void solve() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visited[i][j] || map[i][j] == '0') continue;
				bfs(i, j);
			}
		}

		Collections.sort(answer);
		StringBuilder sb = new StringBuilder();
		sb.append(answer.size()).append("\n");
		for (Integer counts : answer) {
			sb.append(counts).append("\n");
		}
		System.out.print(sb);
	}

	static int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
	private static void bfs(int x, int y) {
		Queue<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[]{x, y});
		visited[x][y] = true;

		int count = 0;
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			count++;
			for (int[] direction : directions) {
				int nextX = current[0] + direction[0];
				int nextY = current[1] + direction[1];
				if (isOutOfBoundary(nextX, nextY) || visited[nextX][nextY] || map[nextX][nextY] == '0') continue;
				queue.offer(new int[]{nextX, nextY});
				visited[nextX][nextY] = true;
			}
		}

		answer.add(count);
	}

	private static boolean isOutOfBoundary(int x, int y) {
		return x < 0 || x >= N || y < 0 || y >= N;
	}

	private static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
	}
}