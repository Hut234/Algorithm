class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        for (int i = 0, j = n % length; i < num_list.length; i++, j = (j + 1) % length)  {
            answer[i] = num_list[j];
        }
        
        return answer;
    }
}