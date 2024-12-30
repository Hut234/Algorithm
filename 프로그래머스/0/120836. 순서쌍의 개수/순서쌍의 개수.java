class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%Math.sqrt(n)==0) answer++;
        
        for(int i=1; i<Math.sqrt(n); i++) {
            if(n%i==0) answer+=2; 
        }
        
        
        return answer;
    }
}