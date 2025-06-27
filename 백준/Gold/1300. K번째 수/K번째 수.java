import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int N;
    static int k;
    public static void main(String[] args) throws IOException {
        getInput();
        solve();
    }

    public static void getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        br.close();
    }

    public static void solve() {
        long start = 1, end = (long) N * N;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (determination(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.print(start);
    }

    public static boolean determination(long target) {
        long count = 0;
        for (int i = 1; i <= N; i++) {
            count += Long.min(N, target / i);
        }
        return count >= k;
    }
}