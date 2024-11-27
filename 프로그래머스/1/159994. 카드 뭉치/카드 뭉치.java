class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        if (goal[0].equals(cards2[0])) start = 1;

        for (int c1=0, c2=0, g=0, cnt=0; cnt<2&&g<goal.length; start++) {
            if (start%2 == 0) {
                for (; c1<cards1.length&&g<goal.length; c1++, g++) {
                    if (!goal[g].equals(cards1[c1])) {
                        cnt++;
                        break;
                    }
                    sb.append(cards1[c1]);
                    cnt = 0;
                }
            } else {
                for (; c2<cards2.length&&g<goal.length; c2++, g++) {
                    if (!goal[g].equals(cards2[c2])) {
                        cnt++;
                        break;
                    }
                    sb.append(cards2[c2]);
                    cnt = 0;
                }
            }
        }
        
        return sb.toString().equals(String.join("", goal)) ? "Yes" : "No";
    }
}