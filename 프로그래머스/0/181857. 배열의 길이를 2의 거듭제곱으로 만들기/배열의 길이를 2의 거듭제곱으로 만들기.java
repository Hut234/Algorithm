class Solution {
    public int[] solution(int[] arr) {
        int arrLen = arr.length;
        int answerLen = 0;
        for (int i = 0; i <= 10; i++) {
            answerLen = (int) Math.pow(2, i);
            if (arrLen <= answerLen) break;
        }
        
        int[] answer = new int[answerLen];
        for (int i = 0; i < arrLen; i++) answer[i] = arr[i];
        return answer;
    }
}