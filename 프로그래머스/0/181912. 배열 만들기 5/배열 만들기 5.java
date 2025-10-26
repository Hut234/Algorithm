import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for (String intStr : intStrs) {
            int value = Integer.parseInt(intStr.substring(s, s + l));
            if (value > k) answer.add(value);
        }
        
        return answer;
    }
}