class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        for(int i=0, cur=0; i<section.length; i++) {
            if (cur<section[i]) {
                answer++;
                cur = section[i] +m -1;
            }
        }
        
        return answer;
    }
}