import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        if (n == 1) {
            int len = slicer[1];
            for (int i = 0; i <= len; i++) answer.add(num_list[i]);
        } else if (n == 2) {
            int len = num_list.length;
            for (int i = slicer[0]; i < len; i++) answer.add(num_list[i]);
        } else if (n == 3) {
            int len = slicer[1];
            for (int i = slicer[0]; i <= len; i++) answer.add(num_list[i]);
        } else {
            int len = slicer[1];
            int gap = slicer[2];
            for (int i = slicer[0]; i <= len; i+=gap) answer.add(num_list[i]);
        }
        
        return answer;
    }
}