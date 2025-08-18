class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        for (int i = 0; i < len; i+=m) {
            sb.append(my_string.substring(i, i + m).charAt(c-1));
        }

        return sb.toString();
    }
}