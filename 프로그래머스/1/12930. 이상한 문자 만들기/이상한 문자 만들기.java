class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        int idx = 0;
        for (int i = 0; i<s.length(); i++) {
            c = s.charAt(i);

            if(c==32) {
                idx = 0;
                sb.append(" ");
            } else {
                if(idx%2==0) {
                    sb.append( (char)(c>=97 ? c-32 : c) );
                } else {
                    sb.append( (char)(c<97 ? c+32 : c) );
                }
                idx++;
            }
        }
        return sb.toString();
    }
}