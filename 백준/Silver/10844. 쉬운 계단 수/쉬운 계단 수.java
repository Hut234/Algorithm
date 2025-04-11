import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int MOD = 1_000_000_000;

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] dp = new int[N + 1][10];
		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}


		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][j + 1] % MOD;
				} else if (j == 9) {
					dp[i][j] = dp[i - 1][j - 1] % MOD;
				} else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
				}
			}
		}

		int sum = 0;
		for (int value : dp[N]) {
			sum = (sum + value) % MOD;
		}

		System.out.print(sum);
	}
}
