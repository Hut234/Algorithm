class Solution {
    public int possibleStringCount(String word) {
        int[] alphabets = new int[26];
        for (int i = 0; i < word.length(); i++) alphabets[word.charAt(i) - 'a']++;

        int answer = 1;
        for (int alphabet : alphabets) if (alphabet > 1) answer += alphabet - 1;

        return answer;
    }
}

