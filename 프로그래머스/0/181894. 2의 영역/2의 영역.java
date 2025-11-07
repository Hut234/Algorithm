class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int start = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        int end = -1;
        for (int i = len - 1; i > -1; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        if (start < 0) {
            return new int[]{-1};
        }
        
        if (start == end) {
            return new int[]{arr[start]};
        }
        
        
        len = end - start + 1;
        int[] answer = new int[len];
        for (int i = 0, j = start; i < len; i++, j++) answer[i] = arr[j];
        return answer;
    }
}