class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int len = numLog.length;
        int prev = numLog[0];
        for (int i = 1; i < len; i++) {
            int diff = numLog[i] - prev;
            prev = numLog[i];
            if (diff == 1) {
                answer.append("w");              
            } else if (diff == -1) {
                answer.append("s");                
            } else if (diff == 10) {
                answer.append("d");                
            } else {
                answer.append("a");
            }
        }
        
        return answer.toString();
    }
}