import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int R;
    static int C;
    static boolean[][] visited;
    static char[][] maps;
    static int sheep;
    static int wolf;

    public static void main(String[] args) {
        getInput();
        solve();
    }

    static void solve() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (visited[i][j]) continue;
                int[] counts = new int[2];
                if (maps[i][j] == 'o') {
                    counts[0] = 1;
                    dfs(i, j, counts);
                } else if (maps[i][j] == 'v') {
                    counts[1] = 1;
                    dfs(i, j, counts);
                }

                if (counts[0] > counts[1]) {
                    sheep += counts[0];
                } else {
                    wolf += counts[1];
                }
            }
        }

        System.out.print(sheep + " " + wolf);
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static void dfs(int row, int col, int[] counts) {
        visited[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int nr = row + directions[i][0];
            int nc = col + directions[i][1];
            if (nr < 0 || nc < 0 || nr >= R || nc >= C || maps[nr][nc] == '#' || visited[nr][nc]) continue;
            if (maps[nr][nc] == 'o') {
                counts[0]++;
                dfs(nr, nc, counts);
            } else if (maps[nr][nc] == 'v') {
                counts[1]++;
                dfs(nr, nc, counts);
            } else {
                dfs(nr, nc, counts);
            }
        }

    }


    static void getInput() {
        R = sc.nextInt();
        C = sc.nextInt();
        visited = new boolean[R][C];
        maps = new char[R][C];

        for (int i = 0; i < R; i++) {
            char[] values = sc.next().toCharArray();
            for (int j = 0; j < C; j++) {
                maps[i][j] = values[j];
            }
        }
    }
}