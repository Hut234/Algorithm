import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N;
    static List<Integer>[] graph;
    static boolean[][] visited;
    static String[][] maps;

    public static void main(String[] args) {
        getInput();
        solve();
    }

    static void solve() {
        for (int row = 0; row < N; row++) {
            for (Integer col : graph[row]) {
                dfs(row, col);
            }
        }

        for (boolean[] flags : visited) {
            for (boolean flag : flags) {
                sb.append(flag ? 1 : 0).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void dfs(int root, int next) {
        visited[root][next] = true;
        for (int i = 0; i < N; i++) {
            if ("0".equals(maps[next][i]) || visited[root][i]) continue;
            dfs(root, i);
        }
    }


    static void getInput() {
        N = sc.nextInt();
        graph = new List[N];
        visited = new boolean[N][N];
        maps = new String[N][N];

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                String value = sc.next();
                maps[i][j] = value;
                if ("1".equals(value)) graph[i].add(j);
            }
        }
    }
}