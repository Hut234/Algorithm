import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int w;
    static int h;
    static List<Integer>[] lands;
    static int[][] maps;

    public static void main(String[] args) {
        getInput();
        System.out.print(sb);
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    static void solve() {
        int result = 0;
        Queue<Integer[]> queue = new LinkedList<>();
        for (int row = 0; row < w; row++) {
            for (Integer col : lands[row]) {
                if (maps[row][col] != 1) continue;
                result++;
                queue.offer(new Integer[]{row, col});
                maps[row][col] = 0;

                while (!queue.isEmpty()) {
                    Integer[] cur = queue.poll();
                    for (int i = 0; i < 8; i++) {
                        int nr = cur[0] + directions[i][0];
                        int nc = cur[1] + directions[i][1];
                        if (nr < 0 || nr >= w || nc < 0 || nc >= h || maps[nr][nc] == 0) continue;
                        queue.offer(new Integer[]{nr, nc});
                        maps[nr][nc] = 0;
                    }
                }
            }
        }
        sb.append(result).append("\n");
    }


    static void getInput() {
        while (true) {
            h = sc.nextInt();
            w = sc.nextInt();
            if (w == 0 && h == 0) return;

            maps = new int[w][h];
            lands = new List[w];
            for (int i = 0; i < w; i++) {
                lands[i] = new ArrayList<>();
            }

            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    int value = sc.nextInt();
                    maps[i][j] = value;
                    if (value == 1) lands[i].add(j);
                }
            }
            solve();
        }
    }
}