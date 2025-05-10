import java.util.*;

class Solution {
    public List<Integer> solution(int[] numlist, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            answer.add(numlist[i]);
        }
        
        answer.sort((o1, o2) -> {
            int abs1 = Math.abs(o1 - n);
            int abs2 = Math.abs(o2 - n);
            if (abs1 == abs2) return o2 - o1;
            return abs1 - abs2;
        });
        
        return answer;
    }
}