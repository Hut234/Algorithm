class Solution {
    public int possibleStringCount(String word) {
        int answer = 1;
        char prev = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (prev == cur) answer++;
            else prev = cur;
        }
        return answer;
    }
}

