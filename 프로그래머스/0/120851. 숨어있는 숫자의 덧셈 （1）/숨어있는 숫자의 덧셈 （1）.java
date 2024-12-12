class Solution {
    public int solution(String my_string) {
        String[] nums = my_string.replaceAll("[A-Za-z]", "").split("");
        int answer = 0;
        for(String num : nums) answer += Integer.parseInt(num);
        return answer;
    }
}