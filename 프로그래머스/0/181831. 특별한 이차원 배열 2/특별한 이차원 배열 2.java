class Solution {
    public int solution(int[][] arr) {
        boolean flag = true;
        int len = arr.length;
        for (int i = 0; flag && i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        
        
        return flag ? 1 : 0;
    }
}