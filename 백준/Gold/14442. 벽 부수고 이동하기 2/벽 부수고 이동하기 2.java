import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int N;
	static int M;
	static int K;
	static char[][] map;
	static int[][][] visited;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		K = Integer.parseInt(input[2]);

		visited = new int[N + 1][M + 1][K + 1];
		map = new char[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			char[] chars = br.readLine().toCharArray();
			for (int j = 1; j <= M; j++) {
				map[i][j] = chars[j - 1];
			}
		}
		bfs();
	}

	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static void bfs() {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(1, 1, 0));
		visited[1][1][0] = 1;

		while (!queue.isEmpty()) {
			Point cur = queue.poll();

			if (cur.x == N && cur.y == M) {
				System.out.print(visited[cur.x][cur.y][cur.brokenWallCounts]);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nextX = cur.x + dr[i];
				int nextY = cur.y + dc[i];

				if (isOutOfBoundary(nextX, nextY)) continue;
				int nextBrokenWallCounts = cur.brokenWallCounts + (map[nextX][nextY] == '1' ? 1 : 0);
				if (nextBrokenWallCounts > K || visited[nextX][nextY][nextBrokenWallCounts] != 0) continue;

				queue.offer(new Point(nextX, nextY, nextBrokenWallCounts));
				visited[nextX][nextY][nextBrokenWallCounts] = visited[cur.x][cur.y][cur.brokenWallCounts] + 1;
			}
		}
		System.out.print(-1);
	}

	static boolean isOutOfBoundary(int x, int y) {
		return x < 1 || x > N || y < 1 || y > M;
	}

	static class Point {
		int x;
		int y;
		int brokenWallCounts;

		Point(int x, int y, int brokenWallCounts) {
			this.x = x;
			this.y = y;
			this.brokenWallCounts = brokenWallCounts;
		}
	}
}
