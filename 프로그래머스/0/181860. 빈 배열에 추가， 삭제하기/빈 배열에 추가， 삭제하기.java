import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int repeat = arr[i];
            if (flag[i]) {
                repeat *= 2;
                while (repeat-- > 0) {
                    answer.add(arr[i]);
                }
            } else {
                while (!answer.isEmpty() && repeat-- > 0) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        
        return answer;
    }
}