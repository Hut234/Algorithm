class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int len = answer.length;
        for (int i = 0, j = n - 1; i < len; i++, j++) {
            answer[i] = num_list[j]; 
        }
        
        
        return answer;
    }
}