class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int len = included.length;
        int[] sum = new int[len];
        for (int i = 0; i < len; i++) {
            sum[i] = a + d * i;
        }
        
        for (int i = 0; i < len; i++) {
            if(included[i]) answer += sum[i];
        }
        
        return answer;
    }
}