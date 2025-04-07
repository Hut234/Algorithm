import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] dp = new int[100001];
		Arrays.fill(dp, 100001);

		int[] coins = new int[n];
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
			dp[coins[i]] = 1;
		}

		for (int i = 1; i <= 100000; i++) {
			for (int j = 0; j < n; j++) {
				int minus = i - coins[j];
				if (minus < 1 || minus > 100000) continue;
				dp[i] = Integer.min(dp[i], dp[minus] + 1);
			}
		}

		System.out.print(dp[k] == 100001 ? -1 : dp[k]);
	}
}
