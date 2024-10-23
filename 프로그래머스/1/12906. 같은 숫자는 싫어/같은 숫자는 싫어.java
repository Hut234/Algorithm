import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int tmp = -1;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (tmp == val) continue;
            result.add(val);
            tmp = val;
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}