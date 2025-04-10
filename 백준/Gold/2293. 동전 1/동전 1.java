import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);


		int[] coins = new int[n];
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[k + 1];
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= k; j++) {
				if (coins[i] + j > k) continue;
				dp[coins[i] + j] += dp[j];
			}
		}

		System.out.print(dp[k]);
	}
}
