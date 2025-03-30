import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int N;
	static int M;
	static char[][] graph;
	static int[][][] visited;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);

		graph = new char[N + 1][M + 1];
		visited = new int[N + 1][M + 1][2];
		for (int i = 1; i <= N; i++) {
			char[] chars = br.readLine().toCharArray();
			for (int j = 1; j <= M; j++) {
				graph[i][j] = chars[j - 1];
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
				System.out.print(visited[cur.x][cur.y][cur.isBroken]);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nextX = cur.x + dr[i];
				int nextY = cur.y + dc[i];
				if (isOutOfBoundary(nextX, nextY) || visited[nextX][nextY][cur.isBroken] != 0) continue;

				if (graph[nextX][nextY] == '0') {
					queue.offer(new Point(nextX, nextY, cur.isBroken));
					visited[nextX][nextY][cur.isBroken] = visited[cur.x][cur.y][cur.isBroken] + 1;
				} else if (graph[nextX][nextY] == '1' && cur.isBroken == 0) {
					queue.offer(new Point(nextX, nextY, 1));
					visited[nextX][nextY][1] = visited[cur.x][cur.y][0] + 1;
				}
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
		int isBroken;
		Point(int x, int y, int isBroken) {
			this.x = x;
			this.y = y;
			this.isBroken = isBroken;
		}
	}
}
