class Solution {
    public int solution(String binomial) {
        String[] values = binomial.split(" ");
        
        int answer = Integer.parseInt(values[0]);
        if ("+".equals(values[1])) {
            answer += Integer.parseInt(values[2]);
        } else if ("-".equals(values[1])) {
            answer -= Integer.parseInt(values[2]);
        } else {
            answer *= Integer.parseInt(values[2]);
        }
        
        return answer;
    }
}