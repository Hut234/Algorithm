class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        
        String answer = "Yes";
        for (String str : goal) {
            if (c1<cards1.length&&str.equals(cards1[c1])) {
                c1++;
            } else if (c2<cards2.length&&str.equals(cards2[c2])) {
                c2++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}