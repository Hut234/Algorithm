class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val >= 50 && val % 2 == 0) {
                answer[i] = val / 2;
            } else if (val < 50 && val % 2 != 0) {
                answer[i] = val * 2;
            } else {
                answer[i] = val;
            }
        }
        
        return answer;
    }
}