class Solution {
    public int solution(int n, String control) {
        int answer = n;
        int len = control.length();
        for (int i = 0; i < len; i++) {
            char direction = control.charAt(i);
            if (direction == 'w'){
                answer += 1;
            } else if(direction == 's') {
                answer -= 1;
            } else if(direction == 'a') {
                answer -= 10;
            } else {
                answer += 10;
            }
        }
        return answer;
    }
}