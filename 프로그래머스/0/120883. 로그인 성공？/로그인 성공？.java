import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<db.length; i++) {
            map.put(db[i][0], db[i][1]);
        }
        
        if(map.containsKey(id_pw[0])) {
            if(map.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
        
    }
}