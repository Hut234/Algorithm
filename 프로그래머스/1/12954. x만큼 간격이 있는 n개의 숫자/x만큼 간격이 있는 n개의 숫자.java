class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long i = x;
        for(int idx=0; idx<n; i+=x, idx++) {
            answer[idx] = i;
        }
        return answer;
    }
}