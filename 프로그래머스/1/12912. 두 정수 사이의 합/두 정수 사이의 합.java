class Solution {
    public long solution(int a, int b) {
        long min = Integer.min(a, b);
        long max = Integer.max(a, b);
        return ((max+1) *max /2) - ((min-1) *min /2);
    }
}