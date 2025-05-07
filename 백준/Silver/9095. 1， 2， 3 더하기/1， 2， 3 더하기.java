import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 11; i++) {
            recur(i, 0);
        }


        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.print(sb);
    }

    static void recur(int idx, int sum) {
        if (idx == 11) return;
        if (sum > idx) return;
        if (sum == idx) {
            dp[idx]++;
            return;
        }

        recur(idx, sum + 1);
        recur(idx, sum + 2);
        recur(idx, sum + 3);
    }
}