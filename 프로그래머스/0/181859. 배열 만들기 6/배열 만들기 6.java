import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            if (answer.size() == 0) answer.add(arr[i]);
            else {
                if (answer.get(answer.size() - 1) == arr[i]) answer.remove(answer.size() - 1);
                else answer.add(arr[i]);
            }
        }
        
        if (answer.size() == 0) answer.add (-1);
        return answer;
    }
}