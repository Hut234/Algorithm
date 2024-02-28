import java.util.Arrays;
class Solution {
    static int[] result;
    static int recur(int n) {
        if(result[n]!=-1) return result[n];
        if(n==0) {
            return result[0] = 0;
        }
        if(n==1) {
            return result[1] = 1;
        }
        return result[n] = (recur(n-2)%1234567 + recur(n-1)%1234567)%1234567;
    }
    
    public int solution(int n) {
        result = new int[n+1];
        Arrays.fill(result, -1);
        recur(n);
        return result[n];
    }
}