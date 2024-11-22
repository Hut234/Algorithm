class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++) {
            int idx = s.lastIndexOf(arr[i], i - 1);
            answer[i] = idx == -1 ? -1 : i-idx;
        }
        
        return answer;
    }
}