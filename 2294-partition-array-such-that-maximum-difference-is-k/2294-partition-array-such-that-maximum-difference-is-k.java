import java.util.Arrays;
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length;) {
            int start = i, end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] - nums[i] <= k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            count++;
            i = end + 1;
        }
        return count;
    }
}