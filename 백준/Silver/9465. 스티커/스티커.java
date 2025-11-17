import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static StringBuilder sb = new StringBuilder();
    static int t;
    static int n;
    static int[][] dp;
    static int[][] stickers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getTc(br);
        while (t-- > 0) {
            getInput(br);
            solve();
        }
        System.out.print(sb);
    }

    public static void getTc(BufferedReader br) throws IOException {
        t = Integer.parseInt(br.readLine());
    }

    public static void getInput(BufferedReader br) throws IOException {
        n = Integer.parseInt(br.readLine());
        dp = new int[3][n + 1];
        stickers = new int[3][n + 1];
        for (int i = 1; i <= 2; i++) {
            String[] args = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                stickers[i][j] = Integer.parseInt(args[j - 1]);
            }
        }
    }

    public static void solve() {
        dp[1][1] = stickers[1][1];
        dp[2][1] = stickers[2][1];

        for (int i = 2; i <= n; i++) {
            dp[1][i] = Integer.max(dp[2][i - 1] + stickers[1][i], dp[1][i - 1]);
            dp[2][i] = Integer.max(dp[1][i - 1] + stickers[2][i], dp[2][i - 1]);
        }

        sb.append(Integer.max(dp[1][n], dp[2][n])).append("\n");
    }

}