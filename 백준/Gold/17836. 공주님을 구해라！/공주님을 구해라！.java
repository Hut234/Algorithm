import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int T;
	static boolean[][][] visited;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		getInput();
		int answer = solve();
		System.out.print(answer == Integer.MAX_VALUE ? "Fail" : answer > T ? "Fail" : answer);
	}

	static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	static int solve() {
		Queue<Warrior> queue = new ArrayDeque<>();
		queue.offer(new Warrior(0, 0, 0, false));
		visited[0][0][0] = true;

		while (!queue.isEmpty()) {
			Warrior cur = queue.poll();

			if (cur.row == N - 1 && cur.col == M - 1) return cur.time;

			for (int[] d : directions) {
				int nr = cur.row + d[0];
				int nc = cur.col + d[1];

				if (isOutOfBoundary(nr, nc)) continue;

				boolean nextSword = cur.hasSword || (map[nr][nc] == 2);
				int swordIdx = nextSword ? 1 : 0;

				if (visited[nr][nc][swordIdx]) continue;
				if (!cur.hasSword && map[nr][nc] == 1) continue;

				visited[nr][nc][swordIdx] = true;
				queue.offer(new Warrior(nr, nc, cur.time + 1, nextSword));
			}
		}
		return Integer.MAX_VALUE; // 도달 불가
	}

	static class Warrior {
		int row;
		int col;
		int time;
		boolean hasSword;

		Warrior(int row, int col, int time, boolean hasSword) {
			this.row = row;
			this.col = col;
			this.time = time;
			this.hasSword = hasSword;
		}
	}

	static boolean isOutOfBoundary(int row, int col) {
		return row < 0 || row >= N || col < 0 || col >= M;
	}

	static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());

		visited = new boolean[N][M][2];
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
}