import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] remainProgresses = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            remainProgresses[i] = 100 -progresses[i];
        }
        
        int[] needDays = new int[progresses.length];
        List<Integer> result = new ArrayList<>();
        int tmp = -1, cur = -1;
        for (int i = 0; i < progresses.length; i++) {
            if (remainProgresses[i] %speeds[i] != 0) needDays[i] = remainProgresses[i] /speeds[i] +1;
            else needDays[i] = remainProgresses[i] /speeds[i];

            if (needDays[i] > tmp) {
                cur++;
                tmp = needDays[i];
                result.add(1);
            }
            else result.set(cur, result.get(cur)+1);
        }    
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}