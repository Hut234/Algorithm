import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length / 3;
        int[][] answer = new int[n][3];

        Arrays.sort(nums);

        int start = 0;
        for (int i = 0; i < n; ++i, start += 3) {
            if (nums[start + 2] - nums[start] > k) return new int[0][0];
            System.arraycopy(nums, start, answer[i], 0, 3);
        }
        return answer;
    }
}