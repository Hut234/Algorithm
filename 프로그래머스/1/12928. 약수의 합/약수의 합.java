class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i=1; i*i<=n; i++) {
           if(n%i==0) {
               if(i == n/i) result += i;
               else result += (i + n/i);
           }
        }
        
        return result;
    }
}