import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[][] dp = new int[10001][3];
    static int[] amounts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        amounts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            amounts[i] = Integer.parseInt(br.readLine());
        }

        dp[1][0] = 0;
        dp[1][1] = amounts[1];
        dp[1][2] = amounts[1];

        for (int i = 2; i <= n; i++) {
            dp[i][0] = Integer.max(dp[i - 1][0], Integer.max(dp[i - 1][1], dp[i - 1][2]));
            dp[i][1] = dp[i - 1][0] + amounts[i];
            dp[i][2] = dp[i - 1][1] + amounts[i];
        }

        System.out.print(Integer.max(dp[n][0], Integer.max(dp[n][1], dp[n][2])));
    }
}