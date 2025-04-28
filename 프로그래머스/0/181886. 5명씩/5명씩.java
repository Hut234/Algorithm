import java.util.*;
class Solution {
    public List<String> solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= names.length; i++) {
            if (i%5 == 1) answer.add(names[i - 1]);
        }
        return answer;
    }
}