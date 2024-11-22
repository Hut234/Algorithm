import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, Integer> numMap = new HashMap<>();
        numMap.put("zero", 0);
        numMap.put("one", 1);
        numMap.put("two", 2);
        numMap.put("three", 3);
        numMap.put("four", 4);
        numMap.put("five", 5);
        numMap.put("six", 6);
        numMap.put("seven", 7);
        numMap.put("eight", 8);
        numMap.put("nine", 9);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();) {
            char c = s.charAt(i);

            if (c > 57) {
                String str = s.substring(i, i+3);
                if (numMap.containsKey(str)) {
                    sb.append(numMap.get(str));
                    i += 3;
                } else {
                    for(int lastIdx=4; i+lastIdx<=s.length(); lastIdx++) {
                        str = s.substring(i, i +lastIdx);
                        if (numMap.containsKey(str)) {
                            sb.append(numMap.get(str));
                            i += lastIdx;
                            break;
                        }
                    }
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}