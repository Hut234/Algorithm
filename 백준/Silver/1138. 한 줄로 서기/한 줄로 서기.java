import java.util.Scanner;

public class Main {

	static int N;
	static boolean flag;
	static int[] taller;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		taller = new int[N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			taller[i] = sc.nextInt();
		}

		dfs(0, new int[N]);
	}

	static void dfs(int depth, int[] line) {
		if (flag) return;

		if (depth == N) {
			flag = true;
			for (int i : line) {
				System.out.print(i + 1 + " ");
			}
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i]) continue;
			if (isNotPositionable(depth, line, i)) continue;
			line[depth] = i;
			visited[i] = true;
			dfs(depth + 1, line);
			visited[i] = false;
		}

	}

	static boolean isNotPositionable(int depth, int[] line, int tall) {
		int count = 0;
		for (int j = 0; j < depth; j++) {
			if (line[j] > tall) count++;
		}
		return count != taller[tall];
	}
}
