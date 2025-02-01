import java.util.*;
class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for (String string : set) {
          sb.append(string);
        }
        
        return sb.toString();
    }
}