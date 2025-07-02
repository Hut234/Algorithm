import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int N;
    static int MAX = -1;
    static int[][] stuff;

    public static void main(String[] args) throws IOException {
        getInput();
        solve();
    }

    public static void getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        stuff = new int[N][3];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            stuff[i][0] = Integer.parseInt(st.nextToken());
            stuff[i][1] = Integer.parseInt(st.nextToken());
            stuff[i][2] = Integer.parseInt(st.nextToken());
            MAX = Integer.max(MAX, stuff[i][1]);
        }
    }

    public static void solve() {
        long start = 1, end = MAX;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (determination((int) mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start > MAX) {
            System.out.print("NOTHING");
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                int A = stuff[i][0];
                int B = stuff[i][2];
                int C = stuff[i][1];
                if (A <= start && C >= start && (start - A) % B == 0) count++;
            }
            System.out.print(start + " " + count);
        }

    }

    public static boolean determination(int target) {
        long count = 0;
        for (int i = 0; i < N; i++) {
            int A = stuff[i][0];
            int B = stuff[i][2];
            int C = Integer.min(stuff[i][1], target);
            if (A > target) continue;
            count += (C - A) / B + 1;
        }
        return count % 2 != 0;
    }
}