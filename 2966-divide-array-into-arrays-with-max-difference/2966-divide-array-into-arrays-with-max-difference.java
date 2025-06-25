import java.util.Arrays;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int len = nums.length;
        int n = len / 3;
        int[][] answer = new int[n][3];

        Arrays.sort(nums);

        int start = 0;
        for (int i = 0; i < n; ++i, start += 3) {
            int end = Integer.min(start + 2, len);
            if (nums[end] - nums[start] > k) return new int[0][0];
            System.arraycopy(nums, start, answer[i], 0, 3);
        }
        return answer;
    }
}