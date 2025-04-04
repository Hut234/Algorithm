import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int result = 0;
	static int r;
	static int c;
	static char[][] maps;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] rc = br.readLine().split(" ");
		r = Integer.parseInt(rc[0]);
		c = Integer.parseInt(rc[1]);

		maps = new char[r + 1][c + 1];
		for (int i = 1; i <= r; i++) {
			char[] chars = br.readLine().toCharArray();
			for (int j = 1; j <= c; j++) {
				maps[i][j] = chars[j - 1];
			}
		}

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (maps[i][j] == 'L')
					bfs(i, j);
			}
		}

		System.out.print(result);
	}

	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	static void bfs(int row, int column) {
		int[][] visited = new int[r + 1][c + 1];
		for (int i = 1; i <= r; i++) {
			Arrays.fill(visited[i], -1);
		}

		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(row, column));
		visited[row][column] = 0;

		while (!queue.isEmpty()) {
			Point cur = queue.poll();
			result = Integer.max(result, visited[cur.row][cur.column]);
			for (int i = 0; i < 4; i++) {
				int nextRow = cur.row + dr[i];
				int nextCol = cur.column + dc[i];

				if (isOutOfBound(nextRow, nextCol) || visited[nextRow][nextCol] != -1 || maps[nextRow][nextCol] == 'W')
					continue;
				queue.offer(new Point(nextRow, nextCol));
				visited[nextRow][nextCol] = visited[cur.row][cur.column] + 1;
			}
		}
	}

	static boolean isOutOfBound(int row, int col) {
		return row <= 0 || row > r || col <= 0 || col > c;
	}

	static class Point {
		int row;
		int column;

		Point(int row, int column) {
			this.row = row;
			this.column = column;
		}
	}
}
