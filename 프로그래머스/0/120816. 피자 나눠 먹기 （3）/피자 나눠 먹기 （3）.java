class Solution {
    public int solution(int slice, int n) {
        int answer = n/slice;
        return n%slice!=0?answer+1:answer;
    }
}