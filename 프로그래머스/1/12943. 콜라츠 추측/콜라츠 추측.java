class Solution {
    public int solution(int num) {
        int count = 0;
        long cur = num;
        while(cur != 1) {
            if(count > 500) {
                count = -1;
                break;
            }
            
            if (cur % 2 == 0) {
                cur /= 2;
            } else {
                cur = cur *3 +1;
            }
            count++;
        }
        
        return count;
    }
}