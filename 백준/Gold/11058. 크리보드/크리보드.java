import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] dp = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			// 1번 그냥 붙이기
			dp[i] = dp[i - 1] + 1;

			// 2, 3, 4번 복사 붙여넣기
			for (int j = 1; j < i - 3; j++) {
				dp[i] = Long.max(dp[i], dp[j] * (i - j - 1));
			}
		}

		System.out.println(dp[N]);

	}
}
