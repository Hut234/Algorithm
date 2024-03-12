import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
    Arrays.sort(arr);
    List<Integer> answer = new ArrayList<>();
    for (int i : arr)
      if (i % divisor == 0)
        answer.add(i);
        
    int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
    return result.length==0 ? new int[]{-1} : result;
    }
}