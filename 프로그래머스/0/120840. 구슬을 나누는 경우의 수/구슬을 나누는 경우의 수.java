import java.math.BigDecimal;
class Solution {
    public int solution(int balls, int share) {
        BigDecimal n = new BigDecimal(1);
        for (int i=balls-share+1; i<=balls; i++) n = n.multiply(BigDecimal.valueOf(i));
        BigDecimal m = new BigDecimal(1);
        for (int i=2; i<=share; i++) m = m.multiply(BigDecimal.valueOf(i));

        BigDecimal answer = n.divide(m);
        return answer.intValue();
    }
}