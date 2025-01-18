class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        for(int i=0; i<sides.length; i++) {
            int cur = sides[i];
            sum += cur;
            max = Integer.max(max, cur);
        }
        
        return sum-max>max?1:2;
    }
}