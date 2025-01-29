class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] division = new int[101];
        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                if(j%i==0) division[j]++;
            }
        }
        
        for(int i=1; i<=n; i++) {
            if(division[i]>=3) answer++;
        }
        
        return answer;
    }
}