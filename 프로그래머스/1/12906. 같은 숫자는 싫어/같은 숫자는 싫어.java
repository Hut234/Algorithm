import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
          if (answer.get(answer.size()-1) == arr[i]) continue;
          answer.add(arr[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}