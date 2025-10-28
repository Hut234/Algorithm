import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for (int index : indices) {
            sb.append(my_string.substring(prev, index));
            prev = index + 1;
        }
        sb.append(my_string.substring(prev));
        
        return sb.toString();
    }
}