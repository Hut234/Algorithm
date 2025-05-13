import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	static StringBuilder sb = new StringBuilder();

	static int N;
	static String[] map;
	static boolean[][] visited;
	static List<Integer> result = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		getInput();
		solve();
	}

	static void solve() {
		int groupCount = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i].charAt(j) == '0' || visited[i][j])
					continue;
				groupCount++;
				result.add(bfs(i, j));
			}
		}

		Collections.sort(result);
		result.add(0, groupCount);
		for (Integer value : result) {
			sb.append(value).append("\n");
		}
		System.out.print(sb);
	}

	static int[][] direction = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

	static Integer bfs(int x, int y) {
		Queue<Integer[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.add(new Integer[] {x, y});

		int buildingCount = 0;
		while (!queue.isEmpty()) {
			Integer[] poll = queue.poll();
			buildingCount++;
			for (int i = 0; i < 4; i++) {
				int nextX = poll[0] + direction[i][0];
				int nextY = poll[1] + direction[i][1];
				if (isOutOfBoundary(nextX, nextY))
					continue;
				if (map[nextX].charAt(nextY) == '0' || visited[nextX][nextY])
					continue;
				visited[nextX][nextY] = true;
				queue.add(new Integer[] {nextX, nextY});
			}
		}
		return buildingCount;
	}

	static boolean isOutOfBoundary(int nextX, int nextY) {
		return nextX < 0 || nextX >= N || nextY < 0 || nextY >= N;
	}

	static void getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new String[N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine();
		}
	}
}