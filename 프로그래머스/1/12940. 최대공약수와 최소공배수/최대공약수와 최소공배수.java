class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n*m) /answer[0];
        return answer;
    }
    public static int gcd(int n, int m) {
        if(n == 0) return m;
        return gcd(m%n, n);
    }
}