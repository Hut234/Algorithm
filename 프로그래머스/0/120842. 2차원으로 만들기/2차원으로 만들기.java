class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int idx = 0, i = 0; i < num_list.length; idx++) {
            for(int j = 0; j < n; i++, j++) {
                answer[idx][j] = num_list[i];
            }
        }
        
        return answer;
    }
}