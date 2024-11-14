class Solution {
    public String solution(int n) {
        String odd = "수";
        String even = "박";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                sb.append(even);
            } else {
                sb.append(odd);
            }
        }
        
        return sb.toString();
    }
}