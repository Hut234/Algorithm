import java.util.*;
class Solution {
    public Set<Integer> solution(int n) {
        Set<Integer> answer = new LinkedHashSet<>();
        for(int i=2; n!=1 && i <= n;) {
            if (n%i == 0) {
                answer.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        
        return answer;
    }
}