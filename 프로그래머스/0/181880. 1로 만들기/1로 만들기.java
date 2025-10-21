class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            answer += makeOne(num);
        }
        return answer;
    }
    
    private int makeOne(int value) {
        int cnt = 0;
        while(value != 1) {
            cnt++;
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = (value - 1) / 2;
            }
        }
        return cnt;
    }
}