class Solution {
    public int solution(int[][] sizes) {
        
        int max = 0;
        int min = 0;
        
        for (int[] size : sizes) {
            int max2 = Integer.max(size[0], size[1]);
            int min2 = Integer.min(size[0], size[1]);
            
            max = Integer.max(max, max2);
            min = Integer.max(min, min2);
        }
        
        
        return max*min;
    }
}