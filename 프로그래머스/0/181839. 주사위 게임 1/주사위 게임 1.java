class Solution {
    public int solution(int a, int b) {
        if (isOdd(a) && isOdd(b)) {
            return a * a + b * b;
        } else if (isOdd(a) || isOdd(b)) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }
    
    static boolean isOdd(int a) {
        return a % 2 != 0;
    }
}