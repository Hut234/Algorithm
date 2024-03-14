import java.util.*;
class Solution {
    static int[] one = {1, 2, 3, 4, 5};
    static int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        int a = 0, b = 0, c = 0, tmp;
        for(int i=0; i<answers.length; i++) {
            if (one[i%5] == answers[i]) a++;
            if (two[i%8] == answers[i]) b++;
            if (three[i%10] == answers[i]) c++;
        }
        int max = Integer.max(a, Integer.max(b, c));
        List<Integer> result = new ArrayList<>();
        if (max == a) result.add(1);
        if (max == b) result.add(2);
        if (max == c) result.add(3);
        return result.stream().mapToInt(Integer::intValue).toArray();
		
    }
}