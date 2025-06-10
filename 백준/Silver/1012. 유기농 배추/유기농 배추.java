import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int T;
    static int M;
    static int N;
    static int K;
    static List<Integer>[] cabbages;
    static int[][] maps;
    static boolean[][] visited;

    public static void main(String[] args) {
        T = sc.nextInt();
        while (T-- > 0) {
            getInput();
            solve();
        }
        System.out.println(sb);
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static void solve() {
        int result = 0;
        Queue<Integer[]> queue = new LinkedList<>();
        for (int row = 0; row <= M; row++) {
            for (Integer col : cabbages[row]) {
                if (visited[row][col]) continue;
                queue.offer(new Integer[]{row, col});
                result++;
                visited[row][col] = true;
                while (!queue.isEmpty()) {
                    Integer[] cur = queue.poll();
                    for (int i = 0; i < 4; i++) {
                        int nr = cur[0] + directions[i][0];
                        int nc = cur[1] + directions[i][1];
                        if (nr < 0 || nr > M || nc < 0 || nc > N || visited[nr][nc] || maps[nr][nc] == 0) continue;
                        queue.offer(new Integer[]{nr, nc});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        sb.append(result).append("\n");
    }


    static void getInput() {
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        cabbages = new List[M + 1];
        maps = new int[M + 1][N + 1];
        visited = new boolean[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            cabbages[i] = new ArrayList<>();
        }

        for (int i = 0; i < K; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            maps[row][col] = 1;
            cabbages[row].add(col);
        }
    }
}