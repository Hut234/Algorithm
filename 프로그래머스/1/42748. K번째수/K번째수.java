import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tmp;
        for(int i=0; i<commands.length; i++) {
          tmp = new int[commands[i][1]-commands[i][0] +1];
          for(int j=commands[i][0], idx=0; j<=commands[i][1]; j++, idx++) {
            tmp[idx] = array[j-1];
          }
          Arrays.sort(tmp);
          answer[i] = tmp[commands[i][2]-1];
        }
        return answer;
    }
}