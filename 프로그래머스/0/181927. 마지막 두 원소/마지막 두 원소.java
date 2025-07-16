class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        
        answer[len] = answer[len - 1] > answer[len - 2] ? answer[len - 1] - answer[len - 2] : answer[len - 1] * 2;         
        return answer;
    }
}