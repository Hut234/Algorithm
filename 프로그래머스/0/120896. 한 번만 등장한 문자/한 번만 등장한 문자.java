import java.util.*;
class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(s.split("")).forEach(
            str -> map.put(str, map.getOrDefault(str, 0) + 1));

        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) sb.append(key);
        }
        
        String[] result = sb.toString().split("");
        Arrays.sort(result);
        return String.join("", result);
    }
}