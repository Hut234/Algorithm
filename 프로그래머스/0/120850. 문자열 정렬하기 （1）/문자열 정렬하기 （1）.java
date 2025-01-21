import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] numbers = my_string.replaceAll("[a-zA-Z]", "").split("");
        Arrays.sort(numbers);
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            answer[i] = Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}