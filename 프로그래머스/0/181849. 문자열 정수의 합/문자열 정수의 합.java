class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        for(String value : arr) {
            answer += Integer.parseInt(value);
        }
        return answer;
    }
}