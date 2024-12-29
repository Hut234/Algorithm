import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> copy = new ArrayList<>();
        for(int i=0; i<emergency.length; i++) copy.add(emergency[i]);
        
        Arrays.sort(emergency);
        int[] answer = new int[emergency.length];
        for(int i=emergency.length-1; i>-1; i--) {
            answer[i] = emergency.length-copy.indexOf(emergency[i]);
        }   
        
        return answer;
    }
}