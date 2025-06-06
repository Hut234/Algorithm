class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        int answer = 0, prev = 0;
        for (int i = 0; i < str.length; i++) {
            if ("Z".equals(str[i])) {
                answer -= prev;
            } else {
                prev = Integer.parseInt(str[i]);
                answer += prev;
            }
        }
        return answer;
    }
}