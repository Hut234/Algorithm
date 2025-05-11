class Solution {
    public String solution(String bin1, String bin2) {
        long sum = Long.parseLong(bin1) + Long.parseLong(bin2);
        StringBuilder sb = new StringBuilder();
        
        while (sum != 0) {
            long remainder = sum % 10;
            if (remainder >= 2) {
                sb.append(remainder % 2);
                sum += remainder / 2 * 10;
            } else if (remainder == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            
            sum /= 10;
        }
        
        if (sb.length() == 0) {
            sb.append("0");
        } else {
            sb.reverse();
        }
        return sb.toString();
    }
}