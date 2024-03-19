import java.util.*;
class Solution {
  public String solution(String[] participant, String[] completion) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : participant) {
      if (map.get(s)==null) map.put(s, 1);
      else map.put(s, map.get(s)+1);
    }

    for (String s : completion) {
      map.put(s, map.get(s)-1);
    }

    String answer = null;
    for (String s : map.keySet()) {
      if (map.get(s) != 0) answer = s;
    }
    return answer;
  }
}