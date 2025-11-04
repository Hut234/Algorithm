class Solution {
    public int solution(String[] strArr) {
        int len = strArr.length;
        int max = -1;
        for (int i = 0; i < len; i++) max = Integer.max(max, strArr[i].length());
        
        int answer = 0;
        int[] lengths = new int[max + 1];
        for (int i = 0; i < len; i++) {
            answer = Integer.max(++lengths[strArr[i].length()], answer);
        }
        return answer;
    }
}