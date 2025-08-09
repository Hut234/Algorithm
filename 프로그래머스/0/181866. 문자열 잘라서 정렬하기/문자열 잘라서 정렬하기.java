import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        List<String> answer = new ArrayList<>();
        String[] str = myString.split("x");
        Arrays.sort(str);
        
        int len = str.length;
        for (int i = 0; i < len; i++) {
            if ("".equals(str[i])) continue;
            answer.add(str[i]);
        }
        

        return answer;
    }
}