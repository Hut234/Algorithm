import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	private static int m;
	private static int n;
	private static int answer;
	private static int[][] tomatoes;
	private static Queue<int[]> q;

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	private static int[][] directions = {{-1 , 0}, {1, 0}, {0, -1}, {0, 1}};
	private static void solve() {
		answer = 0;
		while (!q.isEmpty()) {
			int[] current = q.poll();
			for (int[] direction : directions) {
				int nextX = current[0] + direction[0];
				int nextY = current[1] + direction[1];

				if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) continue;
				if (tomatoes[nextX][nextY] == -1 || tomatoes[nextX][nextY] >= 1) continue;

				q.offer(new int[] {nextX, nextY});
				tomatoes[nextX][nextY] = tomatoes[current[0]][current[1]] + 1;
				answer = tomatoes[nextX][nextY];
			}
		}

		for (int[] tomato : tomatoes) {
			for (int value : tomato) {
				if (value == 0) {
					answer = -1;
				}
			}
		}
		System.out.print(answer == 0 ? 0 : answer == - 1 ? -1 : answer - 1);
	}

	private static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		n = Integer.parseInt(inputs[0]);
		m = Integer.parseInt(inputs[1]);

		tomatoes = new int[m][n];
		q = new ArrayDeque<>();
		for (int i = 0; i < m; i++) {
			inputs = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				tomatoes[i][j] = Integer.parseInt(inputs[j]);
				if (tomatoes[i][j] == 1) q.offer(new int[] {i, j});
			}
		}
	}
}