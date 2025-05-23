import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int N;
	static int M;
	static int wallCount = 3;
	static int result;
	static int[][] maps;
	static boolean[][] visited;
	static List<Integer[]> empty;

	public static void main(String[] args) {
		getInput();
		solve();
	}

	static void solve() {
		dfs(0, 0, new Integer[3][2]);
		System.out.print(result);
	}


	static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	static void bfs() {
		int virus = 0;
		visited	= new boolean[N][M];
		Queue<Integer[]> queue = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (maps[i][j] == 2) {
					visited[i][j] = true;
					queue.add(new Integer[]{i, j});
				}
			}
		}

		while (!queue.isEmpty()) {
			Integer[] cur = queue.poll();
			virus++;
			for (int i = 0; i < 4; i++) {
				int nextX = cur[0] + directions[i][0];
				int nextY = cur[1] + directions[i][1];
				if (isOutOfBoundary(nextX, nextY) || 0 != maps[nextX][nextY] || visited[nextX][nextY]) continue;
				visited[nextX][nextY] = true;
				queue.add(new Integer[]{nextX, nextY});
			}
		}

		result = Integer.max(result, N * M - virus - wallCount);
	}

	static boolean isOutOfBoundary(int x, int y) {
		return x < 0 || x >= N || y < 0 || y >= M;
	}

	static void dfs(int depth, int start, Integer[][] outputs) {
		if (depth == 3) {
			toggleWalls(outputs, 1);
			bfs();
			toggleWalls(outputs, 0);
			return;
		}

		for (int i = start; i < empty.size(); i++) {
			outputs[depth] = empty.get(i);
			dfs(depth + 1, i + 1, outputs);
		}
	}

	static void toggleWalls(Integer[][] outputs, int value) {
		for (int i = 0; i < 3; i++) {
			int x = outputs[i][0];
			int y = outputs[i][1];
			maps[x][y] = value;
		}
	}

	static void getInput() {
		N = sc.nextInt();
		M = sc.nextInt();
		maps = new int[N][M];
		empty = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int value = sc.nextInt();
				maps[i][j] = value;
				if (value == 0) empty.add(new Integer[]{i, j});
				if (value == 1) wallCount++;
			}
		}
	}
}