class Solution {
    public int solution(int a, int b) {
        int str = Integer.parseInt(a + "" + b);
        int it = 2 * a * b;
        return str > it ? str : it;
    }
}