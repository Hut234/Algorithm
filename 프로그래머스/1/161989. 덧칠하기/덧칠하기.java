class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        boolean[] paint = new boolean[n+1];
        for(int i=0; i<section.length; i++) {
            if(!paint[section[i]]) {
                for(int j=section[i]; j<=n&&j<section[i]+m; j++) {
                    paint[j] = true;
                }
                answer++;
            }            
        }
        
        return answer;
    }
}