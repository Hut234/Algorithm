class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] arr = cipher.split("");
        for(int i=code-1; i<arr.length; i+=code) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}