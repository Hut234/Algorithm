class Solution {
    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int answer = -1;
        for (int i = len - 2; i > - 1; i--) {
            int rv = nums[i];
            for (int j = i + 1; j < len; j++) {
                int minus = nums[j] - rv;
                if (minus > 0 && minus > answer) answer = minus;
            }
        }

        return answer;
    }
}