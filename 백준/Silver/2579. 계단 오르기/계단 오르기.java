import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] scores = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			scores[i] = sc.nextInt();
		}

		int[][] dp = new int[N + 1][N + 1];

		dp[1][1] = scores[1];
		if (N >= 2) {
			dp[2][0] = scores[2];
			dp[2][1] = scores[1] + scores[2];
		}
		for (int i = 3; i <= N; i++) {
			dp[i][0] = Integer.max(dp[i - 2][0], dp[i - 2][1]) + scores[i];
			dp[i][1] = dp[i - 1][0] + scores[i];
		}

		System.out.print(Integer.max(dp[N][0], dp[N][1]));
	}
}
