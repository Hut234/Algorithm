class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = 0;
                if (i == j) {
                    value = 1;
                }
                
                answer[i][j] = value;
            }
        }
        
        return answer;
    }
}