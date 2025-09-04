class Solution {
    boolean solution(String s) {
        
        char[] chars = s.toLowerCase().toCharArray();
        int len = s.length();
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == 'p') pCount++;
            else if (chars[i] == 'y') yCount++;
        }

        return pCount == yCount;
    }
}