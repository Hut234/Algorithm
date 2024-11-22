import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i=0; i<numbers.length -1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] result = set.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();

        return result;
    }
}