import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] dp = new long[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print(title(N));
    }

    static long title(int n) {
        dp[1] = 1;
        dp[2] = 3;

        if (dp[n] != 0) return dp[n] % 10007;
        return dp[n] = ((title(n - 2) + title(n - 2)) % 10007 + title(n - 1)) % 10007;
    }
}