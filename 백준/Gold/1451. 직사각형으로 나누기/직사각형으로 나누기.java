import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long[][] accumulate;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		int M = Integer.parseInt(nm[1]);

		int[][] numbers = new int[N][M];
		for (int i = 0; i < N; i++) {
			String[] values = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				numbers[i][j] = Integer.parseInt(values[j]);
			}
		}

		accumulate = new long[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				accumulate[i][j] = accumulate[i - 1][j] + accumulate[i][j - 1] - accumulate[i - 1][j - 1] + numbers[i - 1][j - 1];
			}
		}

		long answer = 0;
		for (int x1 = 1; x1 < N - 1; x1++) {
			for (int x2 = x1 + 1; x2 < N; x2++) {
				long sum1 = sum(1, 1, x1, M);
				long sum2 = sum(x1 + 1, 1, x2, M);
				long sum3 = sum(x2 + 1, 1, N, M);
				answer = Long.max(answer, sum1 * sum2 * sum3);
			}
		}

		for (int x = 1; x < N; x++) {
			for (int y = 1; y < M; y++) {
				long sum1 = sum(1, 1, x, y);
				long sum2 = sum(1, y + 1, x, M);
				long sum3 = sum(x + 1, 1, N, M);
				answer = Long.max(answer, sum1 * sum2 * sum3);
			}
		}

		for (int x = 1; x < N; x++) {
			for (int y = 1; y < M; y++) {
				long sum1 = sum(1, 1, x, M);
				long sum2 = sum(x + 1, 1, N, y);
				long sum3 = sum(x + 1, y + 1, N, M);
				answer = Long.max(answer, sum1 * sum2 * sum3);
			}
		}

		for (int i = 1; i < M - 1; i++) {
			for (int j = i + 1; j < M; j++) {
				long sum1 = sum(1, 1, N, i);
				long sum2 = sum(1, i + 1, N, j);
				long sum3 = sum(1, j + 1, N, M);
				answer = Long.max(answer, sum1 * sum2 * sum3);
			}
		}

		for (int x = 1; x < N; x++) {
			for (int y = 1; y < M; y++) {
				long sum1 = sum(1, 1, x, y);
				long sum2 = sum(x + 1, 1, N, y);
				long sum3 = sum(1, y + 1, N, M);
				answer = Long.max(answer, sum1 * sum2 * sum3);
			}
		}

		for (int x = 1; x < N; x++) {
			for (int y = 1; y < M; y++) {
				long sum1 = sum(1, 1, N, y);
				long sum2 = sum(1, y + 1, x, M);
				long sum3 = sum(x + 1, y + 1, N, M);
				answer = Long.max(answer, sum1 * sum2 * sum3);
			}
		}

		System.out.print(answer);
	}

	private static long sum(int x1, int y1, int x2, int y2) {
		return accumulate[x2][y2] - accumulate[x1 - 1][y2] - accumulate[x2][y1 - 1] + accumulate[x1 - 1][y1 - 1];
	}
}