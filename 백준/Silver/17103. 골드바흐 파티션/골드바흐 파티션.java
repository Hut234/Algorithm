import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static boolean[] isPrime = new boolean[1000001];

    public static void main(String[] args) {
        eratosthenes();
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;
            for (int p = 2; p <= N / 2; p++) {
                if (isPrime[p] && isPrime[N - p]) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }



    private static void eratosthenes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}