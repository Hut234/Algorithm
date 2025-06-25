import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> answer = new ArrayList<>();
        int checkedIndex = 0;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == key) {
                boolean flag = true;
                int j = Integer.max(checkedIndex, i - k);
                for (; j < Integer.min(i + k + 1, nums.length); j++) {
                    if (i < j && nums[j] == key) {
                        i = j;
                        checkedIndex = j;
                        flag = false;
                        break;
                    }
                    answer.add(j);
                }
                if (flag) i = j + 1;
            } else i++;

        }
        return answer;
    }
}