import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            for (int j = 0; j < num; j++) answer.add(num);
        }
        return answer;
    }
}