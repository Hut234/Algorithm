class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[(len - 1) / n + 1];
        for (int i = 0, idx = 0; idx < len; i++, idx += n) {
            answer[i] = num_list[idx];
        }
        return answer;
    }
}