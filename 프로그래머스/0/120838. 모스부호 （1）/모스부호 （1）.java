class Solution {
    public String solution(String letter) {
        String[] morse = { ".-","-...","-.-.","-..",".","..-.",
                 "--.","....","..",".---","-.-",".-..",
                 "--","-.","---",".--.","--.-",".-.",
                 "...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String answer = "";
        String[] letters = letter.split(" ");
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(letters[i])) {
                    answer += String.valueOf((char) ('a' + j));
                    break;
                }
            }
        }
        
        
        return answer;
    }
}