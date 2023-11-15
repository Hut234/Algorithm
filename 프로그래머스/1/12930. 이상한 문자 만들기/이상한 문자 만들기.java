class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ", -1);
        String word;
        char c;
        for (int i = 0; i < words.length; i++) {
            word = words[i];

            if(word.length()!=0) {
                for (int j = 0; j < word.length(); j++) {
                    c = word.charAt(j);
                    if (j % 2 == 0) {
                        sb.append((char) (c>=97 ? c-32 : c));
                    } else {
                        sb.append((char) (c<97 ? c+32 : c));
                    }
                }
            }
            if(i!= words.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}