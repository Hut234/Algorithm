import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int result = Integer.MAX_VALUE;
    static int[][] tastes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        tastes = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            tastes[i][0] = Integer.parseInt(st.nextToken());
            tastes[i][1] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 1, 0);
        System.out.print(result);
    }

    static void dfs(int depth, int sour, int bitter) {
        if (depth == n) {
            if (sour == 1 && bitter == 0) return;
            result = Integer.min(result, Math.abs(sour - bitter));
            return;
        }

        dfs(depth + 1, sour * tastes[depth][0], bitter + tastes[depth][1]);
        dfs(depth + 1, sour, bitter);
    }
}