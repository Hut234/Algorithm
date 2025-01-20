class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++) {
            if(i == num1) {
                sb.append(arr[num2]);
            }else if (i == num2) {
                sb.append(arr[num1]);
            }else {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}