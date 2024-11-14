class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int cnt = 0;
            if(i%Math.sqrt(i) != 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}