import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                queue.offer('(');
            } else {
                if (queue.size() < 1) {
                    answer = false;
                    break;
                }

                queue.poll();
            }
        }

        if (queue.size() != 0) answer = false;
        return answer;
    }
}