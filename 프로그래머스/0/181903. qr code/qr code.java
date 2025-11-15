class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        int len = code.length();
        String[] splited = code.split("");
        for (int i = 0; i < len; i += q) {
            if (i + r < len) answer.append(splited[i + r]);
        }
        
        return answer.toString();
    }
}