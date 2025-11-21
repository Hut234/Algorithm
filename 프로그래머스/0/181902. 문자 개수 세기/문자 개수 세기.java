class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++;
            } else {
                answer[c - 'A']++;
            }
        }
        
        return answer;
    }
}