import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    static int N;
    static int M;
    static boolean[] isPrime;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        isPrime = new boolean[M + 1];
        
        eratosthenes();
        
        StringBuilder sb = new StringBuilder();
        for (int i = N; i <= M; i++) {
            if (isPrime[i]) sb.append(i).append("\n");
        }
        
        System.out.print(sb);
    }
    
    static void eratosthenes() {
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        int sqrtN = (int) Math.sqrt(M);
        for (int i = 2; i <= sqrtN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= M; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}