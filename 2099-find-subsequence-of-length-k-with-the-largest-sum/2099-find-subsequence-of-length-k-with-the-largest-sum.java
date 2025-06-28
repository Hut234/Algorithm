import java.util.Arrays;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int len = nums.length;

        NumWithIndex[] nwi = new NumWithIndex[len];
        for (int i = 0; i < len; i++) nwi[i] = new NumWithIndex(i, nums[i]);

        Arrays.sort(nwi, (o1, o2) -> o2.value - o1.value);
        Arrays.sort(nwi, 0, k, (o1, o2) -> o1.index - o2.index);
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) answer[i] = nwi[i].value;

        return answer;
    }

    static class NumWithIndex {
        int index;
        int value;
        NumWithIndex(int idx, int val) {
            this.index = idx;
            this.value = val;
        }
    }
}