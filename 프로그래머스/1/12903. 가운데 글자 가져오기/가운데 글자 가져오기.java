class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = null;
        int length = arr.length;
        if (length % 2 == 0) {
            answer = arr[length /2 -1].concat(arr[length /2]);
        } else {
            answer = arr[length /2];
        }
        
        return answer;
    }
}