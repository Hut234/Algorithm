class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];
        for (int i = 1; i < 4; i++) {
            int x = dots[i][0];
            int y = dots[i][1];
            minX = Integer.min(minX, x);
            minY = Integer.min(minY, y);
            maxX = Integer.max(maxX, x);
            maxY = Integer.max(maxY, y);
        }
        
        return Math.abs(maxX - minX) * Math.abs(maxY - minY);
    }
}