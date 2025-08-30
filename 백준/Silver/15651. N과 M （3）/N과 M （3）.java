import java.util.Scanner;

public class Main {

	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N =  sc.nextInt();
		M = sc.nextInt();

		dfs(0, new int[M]);
		System.out.print(sb);
	}

	static void dfs(int depth, int[] output) {
		if (depth == M) {
			for (int value : output) {
				sb.append(value).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			output[depth] = i;
			dfs(depth + 1, output);
		}
	}
}