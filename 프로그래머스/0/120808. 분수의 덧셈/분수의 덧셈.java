class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcd = gcd(denom1, denom2);
        answer[1] = (denom1*denom2) /gcd;
        answer[0] = answer[1]/denom1 *numer1 + answer[1]/denom2 *numer2;
        
        int gcd2 = gcd(answer[0], answer[1]);
        
        answer[0] /= gcd2;
        answer[1] /= gcd2;
        return answer;
    }
    
    public int gcd(int x, int y) {
        if (y%x == 0) return x;
        return gcd(y%x, x);
    }
}