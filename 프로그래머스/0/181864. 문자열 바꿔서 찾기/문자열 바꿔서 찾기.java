class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if ('A' == myString.charAt(i)) sb.append("B");
            else sb.append("A");
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}