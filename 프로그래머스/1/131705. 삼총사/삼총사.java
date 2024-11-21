class Solution {
    public static int answer = 0;
    public int solution(int[] number) {
        recur(0, 0, 0, number.length, number);
        return answer;
    }
    
    public static void recur(int cnt, int sum, int start, int len, int[] number) {
        if (cnt == 3) {
            if (sum == 0) answer++;
            return;
        }

        for(int i=start; i<len; i++) {
            sum += number[i];
            recur(cnt+1, sum, i+1, len, number);
            sum -= number[i];
        }
    }
}