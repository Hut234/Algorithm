import java.util.*;

class Solution {
    
    private static int length;
    private static String[] numbers;
    private static boolean[] visited;
    private static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        length = numbers.length();
        visited = new boolean[length];
        Solution.numbers = numbers.split("");

        recur("");
        return set.size();
    }
    
    private static void recur(String str) {
        if(isPrime(str)) {
            set.add(Integer.valueOf(str));
        }

        for (int i=0; i < length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            recur(str.concat(numbers[i]));
            visited[i] = false;
        }
    }
    
    private static boolean isPrime(String str) {
        if (str.length() == 0) return false;

        int value = Integer.parseInt(str);
        if (value == 1 || value == 0) return false;

        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(value) ; i++) {
            if (value %i == 0) {
                flag= false;
                break;
            }
        }

        return flag;
    }
}