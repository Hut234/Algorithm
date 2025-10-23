class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(my_string.substring(s, e + 1));
        sb2.reverse();
        sb.append(sb2.toString());
        sb.append(my_string.substring(e + 1));
        return sb.toString();
    }
}