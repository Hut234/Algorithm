
class Solution {
    public int solution(int n) {
        return decimal(ternary(n));
    }
    
    public static String ternary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0) {
            sb.append(n%3);
            n /= 3;
        }
        return sb.toString();
    }
    
    public static int decimal(String n) {
        System.out.println(n);
        int result = 0;
        for(int i=0, j=n.length() -1; i<n.length(); i++, j--) {
            result += (n.charAt(j) -48) *Math.pow(3, i);
        }
        
        return result;
    }
}
    
