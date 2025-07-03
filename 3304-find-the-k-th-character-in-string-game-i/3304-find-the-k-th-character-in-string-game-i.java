class Solution {
    public char kthCharacter(int k) {
        int[] dp = new int[513];
        
        dp[1] = 'a';
        dp[2] = 'b';
        for (int r = 1; r <= 8; r++) {
            int cnt = (int) Math.pow(2, r);
            int len = 2 * cnt + 1;
            for (int start = cnt + 1; start < len; start++) {
                dp[start] = (dp[start - cnt] + 1) % 'z';
            }
        }
        return (char) dp[k];
    }
}