class Solution {
    public int solution(int[] numbers) {
        int result = 45;
        for(int number : numbers) result -= number;
        return result;
    }
}