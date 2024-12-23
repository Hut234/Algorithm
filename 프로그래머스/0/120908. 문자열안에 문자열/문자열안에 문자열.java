class Solution {
    public int solution(String str1, String str2) {
        String replace = str1.replace(str2, "");
        return str1.length() == replace.length() ? 2 : 1;
    }
}