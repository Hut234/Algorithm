class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int[] cnt = new int[46];
        for(int i=0; i<6; i++) cnt[win_nums[i]]++;
        
        int zero = 0;
        for(int i=0; i<6; i++) {
            if (lottos[i]==0) zero++;
            else if (cnt[lottos[i]] > 0) cnt[lottos[i]]--;
        }
        
        int sum = 0;
        for(int val : cnt) sum += val;
        
        int[] result = {1, 2, 3, 4, 5, 6, 6};
        answer[0] = result[sum-zero];
        answer[1] = result[sum];
        
        return answer;
    }
}