class Solution {
    public int solution(int[] sides) {
        // 0 < max - min <= max + min
        // 3 ~ 9 -1 or -2
        int max = Integer.max(sides[0], sides[1]);
        int min = Integer.min(sides[0], sides[1]);
        int plus = max + min - 1;
        int minus = max - min;
        int answer = plus - minus;
        return  answer;
    }
}