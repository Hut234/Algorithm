class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int count = 0;
        if (a == b) {
            count++;
            if (b == c) count++;
        } else {
            if (b == c || a == c) count++;
        }
        
        answer = a + b + c;
        if (count >= 1) {
            answer *= a*a + b*b + c*c;
        }
        if (count >= 2) {
            answer *= a*a*a + b*b*b + c*c*c;
        }
        
        return answer;
    }
}