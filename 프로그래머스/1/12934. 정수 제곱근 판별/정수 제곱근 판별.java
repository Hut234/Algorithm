class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long floor = (long) Math.floor(sqrt);
        return sqrt == floor ? (floor+1) * (floor+1) : -1;
    }
}