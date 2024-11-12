import java.util.*;
class Solution {
    public long solution(long n) {
        String[] splits = String.valueOf(n).split("");
        Arrays.sort(splits, Collections.reverseOrder());
        return Long.valueOf(String.join("", splits));
    }
}