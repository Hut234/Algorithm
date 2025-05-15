import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] A, cnt;

    public static void main(String[] args) throws IOException {
        getInput();
        solve();
    }

    static void solve() {
        long result = 0;
        for (int L=1, R=0; L<=N; L++){
            while (R + 1 <= N && cnt[A[R+1]] == 0){
                R++;
                cnt[A[R]]++;
            }

            result += R - L + 1;

            cnt[A[L]]--;
        }

        System.out.print(result);
    }

    static void getInput() throws IOException {
        N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        cnt = new int[100000 + 1];
    }
}