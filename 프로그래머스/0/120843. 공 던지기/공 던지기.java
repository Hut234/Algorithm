class Solution {
    public int solution(int[] numbers, int k) {
        int cnt = 1, answer = 0, cur = 2;
        while (cnt < k) {
            if (cur >= numbers.length-2) {
                answer = cur;
                cur /= numbers.length-1;
            } else {
                answer = cur;
                cur += 2;
            }

            cnt++;
        }
        return answer+1;
    }
}