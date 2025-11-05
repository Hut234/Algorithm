import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]+");
        
        List<String> result = new ArrayList<>();
        for (String p : parts) {
            if (!p.isEmpty()) {
                result.add(p);
            }
        }
        
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}