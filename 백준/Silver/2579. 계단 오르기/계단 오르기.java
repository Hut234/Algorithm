import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] stairs = new int[N + 1];
        for (int i = 1; i <= N; i++) stairs[i] = sc.nextInt();
        
        int[][] dp = new int[N + 1][3];
        dp[1][1] = stairs[1];
        
        if (N > 1) {
            dp[2][1] = stairs[1] + stairs[2];
            dp[2][2] = stairs[2];
        }
        
        
        for (int i = 3; i <= N; i++) {
            dp[i][1] = dp[i - 1][2] + stairs[i];
            dp[i][2] = Integer.max(dp[i - 2][1], dp[i - 2][2]) + stairs[i];
        }
        
        System.out.print(Integer.max(dp[N][1], dp[N][2]));
    }
}