import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i=3; i<=n; i++) {
            if(i%2!=0) al.add(i);
        }
        
        int[] answer = new int[al.size()];
        int idx = 0;
        for(Integer i : al) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}