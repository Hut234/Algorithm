import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split("");
        String[] input2 = br.readLine().split("");
        int[][] dp = new int[input1.length + 1][input2.length + 1];

        for (int i = 1; i <= input1.length; i++) {
            for (int j = 1; j <= input2.length; j++) {
                if (input1[i - 1].equals(input2[j -1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.print(dp[input1.length][input2.length]);
    }
}