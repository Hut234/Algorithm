import java.util.*;
class Solution {

    static String numberStr;
    static boolean[] isPrime = new boolean[10000000];
    static boolean[] visited;
    static Set<Integer> numbers = new HashSet<>();
    static int length;
    public int solution(String word) {
        numberStr = word;
        length = word.length();
        visited = new boolean[length];
        eratosthenes(9999999);
        permutation(0, 0);
        return solve();
    }
    
    static int solve() {
        int answer = 0;
        for (Integer value : numbers) {
            if (isPrime[value]) answer++;
        }
        return answer;
    }
    
    static void permutation(int before, int depth) {
        if (depth == length) return;
        
        for (int i = 0; i < length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            int newValue = before * 10 + numberStr.charAt(i) - '0';
            numbers.add(newValue);
            permutation(newValue, depth + 1);
            visited[i] = false;
        }
    }
    
    static void eratosthenes(int n) {
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}