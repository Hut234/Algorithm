import java.util.*;
class Solution {
    public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        
        int l = -1;
        int r = -1;
        int len = str_list.length;
                for (int i = 0; i < len; i++) {
            if (str_list[i].equals("l")) {
                l = i;
                break;
            }
            if (str_list[i].equals("r")) {
                r = i;
                break;
            }
        }
        
        if (l == -1 && r == -1) {
            return answer;
        }
        
        if (l != -1) {
            for (int i = 0; i < l; i++) answer.add(str_list[i]);
        } 

        else {
            for (int i = r + 1; i < len; i++) answer.add(str_list[i]);
        }
        
        return answer;
    }
}