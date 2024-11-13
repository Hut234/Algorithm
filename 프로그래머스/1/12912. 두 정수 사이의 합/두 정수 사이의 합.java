class Solution {
    public long solution(int a, int b) {
        long min = Integer.min(a, b);
        long max = Integer.max(a, b);
        return (max-min +1) *(max+min) /2;
    }
}