class Solution {
    
    public int solution(String A, String B) {
        
        int answer = -1;
        for (int i = 0; i < A.length(); i++) {
            int minus = A.length() - i;
            String front = A.substring(minus, A.length());
            String back = A.substring(0, minus);
            String newWord = front + back;
            if (newWord.equals(B)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    

}