import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Main {

	static int N;
	static List<Integer> counts;
	static char[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	static void solve() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visited[i][j] || map[i][j] == '0') continue;
				bfs(i, j);
			}
		}

		Collections.sort(counts);

		StringBuilder sb = new StringBuilder();
		sb.append(counts.size()).append("\n");
		for (Integer count : counts) {
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}

	static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	static void bfs(int row, int column) {
		Queue<int[]> queue = new ArrayDeque<>();
		visited[row][column] = true;
		queue.offer(new int[]{row, column});

		int count = 0;
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			count++;
			for (int[] direction : directions) {
				int nextRow = cur[0] + direction[0];
				int nextColumn = cur[1] + direction[1];
				if (isOutOfBoundary(nextRow, nextColumn) || visited[nextRow][nextColumn] || map[nextRow][nextColumn] == '0') continue;
				visited[nextRow][nextColumn] = true;
				queue.offer(new int[]{nextRow, nextColumn});
			}
		}
		counts.add(count);
	}

	static boolean isOutOfBoundary(int row, int column) {
		return row < 0 || row >= N || column < 0 || column >= N;
	}

	static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		counts = new ArrayList<>();
		map = new char[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
	}
}