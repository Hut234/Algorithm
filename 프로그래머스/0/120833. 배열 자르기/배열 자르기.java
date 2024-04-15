class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i=num1, j=0; i<=num2; i++,j++) {
            answer[j] = numbers[i];
        }
        return answer;
    }
}