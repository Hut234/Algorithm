import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] sequences;
    static boolean[] isExisted = new boolean[100_001];

    public static void main(String[] args) throws IOException {
        getInput();
        solve();
    }

    static void solve() {
        long result = 0;

        for (int L = 1, R = 0; L <= N; L++) {

            while (R + 1 <= N && !isExisted[sequences[R + 1]]) {
                isExisted[sequences[++R]] = true;
            }

            result += R - L + 1;
            isExisted[sequences[L]] = false;
        }

        System.out.print(result);
    }

    static void getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        sequences = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            sequences[i] = Integer.parseInt(st.nextToken());
        }
    }
}