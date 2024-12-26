import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String[] strings = my_string.toLowerCase().split("");
        Arrays.sort(strings);
        String answer = String.join("", strings);
        return answer;
    }
}