import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 100;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int cur = array[i];
            if (diff > Math.abs(cur - n)) {
                diff = Math.abs(cur - n);
                answer = cur;
            }
        }
        
        
        return answer;
    }
}