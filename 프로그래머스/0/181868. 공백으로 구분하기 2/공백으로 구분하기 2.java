import java.util.*;
class Solution {
    public List<String> solution(String my_string) {
        String[] splitedString = my_string.split(" ");

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < splitedString.length; i++) {
            if (!splitedString[i].equals("")) answer.add(splitedString[i]);
        }
        return answer;
    }
}