class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        boolean isEven = k % 2 == 0;
        for(int i=0; i<arr.length; i++) {
            if (isEven) answer[i] = arr[i] + k;
            else answer[i] = arr[i] * k;
            
        }
        return answer;
    }
}