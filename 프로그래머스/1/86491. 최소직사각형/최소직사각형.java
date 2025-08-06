class Solution {
    public int solution(int[][] sizes) {
        
        int min = 0;
        int max = 0;
        int len = sizes.length;
        for (int i = 0; i < len; i++) {
            int shorter = Integer.min(sizes[i][0], sizes[i][1]);
            int longer = Integer.max(sizes[i][0], sizes[i][1]);
            
            max = Integer.max(max, longer);
            min = Integer.max(min, shorter);
        }

        return min * max;
    }
}