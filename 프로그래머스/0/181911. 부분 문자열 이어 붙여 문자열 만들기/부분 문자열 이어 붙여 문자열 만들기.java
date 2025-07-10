class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int len = my_strings.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return sb.toString();
    }
}