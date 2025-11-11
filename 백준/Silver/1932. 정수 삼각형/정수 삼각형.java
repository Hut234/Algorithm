import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] values = new int[n + 1][n + 1];
		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) {
				values[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] dp = new int[n + 1][n + 1];
		dp[1][1] = values[1][1];
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Integer.max(dp[i - 1][j - 1], dp[i - 1][j]) + values[i][j];
			}
		}

		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer = Integer.max(answer, dp[n][i]);
		}
		System.out.print(answer);
	}
}
