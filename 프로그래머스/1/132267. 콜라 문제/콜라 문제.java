class Solution {
    public int solution(int a, int b, int n) {        
        int answer = 0;
        int remainder = 0;
        while(n >= a) {
            remainder += n%a;
            if (remainder/a > 0) {
                answer += remainder/a;
                remainder -= remainder*a;
            }
            answer += n/a *b;

            n = n/a *b;
            if ((n%a != 0) && (remainder >= a -(n%a))) {
                remainder -= a - n%a;
                n += a - n%a;
            }
        }
        return answer;
    }
}