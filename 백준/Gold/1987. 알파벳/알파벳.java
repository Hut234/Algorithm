import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int r, c, result;
    static char[][] alphabets;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rc = br.readLine().split(" ");
        r = Integer.parseInt(rc[0]);
        c = Integer.parseInt(rc[1]);

        alphabets = new char[r][c];
        for (int i = 0; i < r; i++) {
            alphabets[i] = br.readLine().toCharArray();
        }

        int visited = 1 << (alphabets[0][0] - 'A');
        dfs(0, 0, visited, 1);
        System.out.print(result);
    }

    static void dfs(int row, int col, int visited, int depth) {
        result = Math.max(result, depth);

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];

            if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                int alpha = alphabets[nr][nc] - 'A';
                if ((visited & (1 << alpha)) == 0) { 
                    dfs(nr, nc, visited | (1 << alpha), depth + 1);
                }
            }
        }
    }
}