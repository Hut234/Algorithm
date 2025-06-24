import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) keyIndices.add(i);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int index : keyIndices) {
                if (Math.abs(i - index) <= k) {
                    answer.add(i);
                    break;
                }
            }
        }

        return answer;
    }
}