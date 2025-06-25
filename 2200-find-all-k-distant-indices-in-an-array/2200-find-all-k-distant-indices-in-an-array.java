import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> answer = new ArrayList<>();
        int len = nums.length;
        int nextIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == key) {
                int from = Integer.max(i - k, nextIndex);
                int to = Integer.min(i + k + 1, len);
                for (; from < to; from++) {
                    answer.add(from);
                }
                nextIndex = from;
            }
        }

        return answer;
    }
}