import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int n;
    static int m;
    static Integer[] goal = new Integer[3];
    static boolean[][] visited;
    static int[][] maps;
    static int[][] distances;

    public static void main(String[] args) throws IOException {
        getInput();
        solve();
    }

    public static void getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NL = br.readLine().split(" ");
        n = Integer.parseInt(NL[0]);
        m = Integer.parseInt(NL[1]);
        visited = new boolean[n][m];
        maps = new int[n][m];
        distances = new int[n][m];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
                if (maps[i][j] == 2) {
                    goal[0] = i;
                    goal[1] = j;
                    goal[2] = 0;
                }
            }
        }
    }

    public static void solve() {
        bfs();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (distances[i][j] == 0 && maps[i][j] == 1) {
                    sb.append(-1);
                } else {
                    sb.append(distances[i][j]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void bfs() {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(goal);
        visited[goal[0]][goal[1]] = true;

        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = cur[0] + directions[i][0];
                int nextY = cur[1] + directions[i][1];
                int nextD = cur[2] + 1;

                if (isOutOfBoundary(nextX, nextY) || maps[nextX][nextY] == 0 || visited[nextX][nextY]) continue;
                visited[nextX][nextY] = true;
                distances[nextX][nextY] = nextD;
                queue.offer(new Integer[]{nextX, nextY, nextD});
            }
        }
    }

    public static boolean isOutOfBoundary(int x, int y) {
        return x < 0 || x >= n || y < 0 || y >= m;
    }
}