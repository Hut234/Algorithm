class Solution {
    public int[] solution(String myString) {
        String[] s = myString.concat(" ").split("x");
        int len = s.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = s[i].trim().length();
        }
        return answer;
    }
}