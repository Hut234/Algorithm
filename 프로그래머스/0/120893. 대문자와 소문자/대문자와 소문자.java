class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            int val = my_string.charAt(i);

            if (val > 94) sb.append((char)(val-32));
            else sb.append((char)(val+32));
        }
        return sb.toString();
    }
}