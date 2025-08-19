class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        int len = board.length;
        int len2 = board[0].length;
        for (int i = 0; i < len; i++) {
            if (i > k) break;
            for (int j = 0; j < len2; j++) {
                if (i + j > k) break;
                answer += board[i][j];
            }
        }
        
        return answer;
    }
}