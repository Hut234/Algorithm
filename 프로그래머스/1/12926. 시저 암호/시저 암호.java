class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 32) sb.append(" ");
            else if (c < 91) {
                sb.append((char)(c+n > 90 ? (c+n) -26 : c+n));
            } else {
                sb.append((char)(c+n > 122 ? (c+n) -26 : c+n));
            }
        }

        return sb.toString();
    }
}