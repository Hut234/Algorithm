class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int len = num_list.length;
        for (int i = 0; i < len; i++) { 
            if (num_list[i] < 0) { 
                answer = i;
                break;
            }
        }
        return answer;
    }
}