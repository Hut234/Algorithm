class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        int tmp = x;
        while(tmp!=0) {
            sum += tmp%10;
            tmp = tmp/10;
        }
        return x%sum==0;
    }
}