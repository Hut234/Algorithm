class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();
        System.out.println("1: " + s);
        if (len == 4 || len == 6) answer = true;
        for (int i=0; answer && i<len; i++) {
            System.out.println("2: " + s.charAt(i));
            int c = s.charAt(i)-48;
            if(c < 0 || c > 9) {
                System.out.println("3: " + s.charAt(i));
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}