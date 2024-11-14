class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int idx = 0;
        for(String s : seoul) {
            if (s.equals("Kim")) { 
                break;
            }
            idx++;
        }
        
        return answer.concat(String.valueOf(idx)).concat("에 있다");
    }
}