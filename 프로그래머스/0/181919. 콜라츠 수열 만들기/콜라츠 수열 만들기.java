import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            answer.add(n);
            
        }
        
        return answer;
    }
}