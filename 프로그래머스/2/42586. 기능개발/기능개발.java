import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] arr = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            arr[i] = 100 -progresses[i];
        }
        
        int[] arr2 = new int[progresses.length];
        List<Integer> result = new ArrayList<>();
        int tmp = -1, cur = -1;
        for (int i = 0; i < progresses.length; i++) {
            if (arr[i] %speeds[i] != 0) arr2[i] = arr[i] /speeds[i] +1;
            else arr2[i] = arr[i] /speeds[i];

            if (arr2[i] > tmp) {
                cur++;
                tmp = arr2[i];
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