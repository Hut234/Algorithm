import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        
        int len = intervals.length;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            for (int j = start; j <= end; j++) {
                answer.add(arr[j]);
            }
        }
        
        return answer;
    }
}