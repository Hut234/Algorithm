import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int[] sorted = Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(sorted);

        int cur = 0;
        int maxIndex = sorted.length -1;
        while (maxIndex >= 0) {
            if (cur == priorities.length) cur = 0;
            if (priorities[cur] == sorted[maxIndex]) {
                answer++;
                if (cur == location) {
                    break;
                }
                maxIndex--;
            }
            cur++;
        }

        return answer;
    }
}