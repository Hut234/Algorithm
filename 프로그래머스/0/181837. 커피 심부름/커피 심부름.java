class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String s : order) {
            if (s.equals("iceamericano") || s. equals("americanoice") || s.equals("hotamericano") || s.equals("americanohot") || s.equals("americano") || s.equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        
        
        return answer;
    }
}