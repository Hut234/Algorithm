import java.util.Scanner;

class Main {

	static int n;
	static int answer;
	static int[] numbers;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		visited = new boolean[n];
		dfs(0, new int[n]);
		System.out.println(answer);
	}

	static void dfs(int depth, int[] inputs) {
		if (depth == n) {

			int sum = 0;
			for (int i = 1; i < n; i++) {
				sum += Math.abs(inputs[i - 1] - inputs[i]);
			}

			answer = Integer.max(sum, answer);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i]) continue;
			inputs[depth] = numbers[i];
			visited[i] = true;
			dfs(depth + 1, inputs);
			visited[i] = false;
		}
	}
}
