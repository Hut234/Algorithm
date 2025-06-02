import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int R;
    static int C;
    static char[][] maps;
    static int[][] dist;

    public static void main(String[] args) {
        getInput();
        solve();
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static void solve() {
        Queue<Integer[]> hedgehog = new LinkedList<>();
        Queue<Integer[]> water = new LinkedList<>();
        int[] goal = new int[2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (maps[i][j] == '*') {
                    water.offer(new Integer[] {i, j});
                    dist[i][j] = 0;
                }
                if (maps[i][j] == 'S') hedgehog.offer(new Integer[] {i, j});
                if (maps[i][j] == 'D') {
                    goal[0] = i;
                    goal[1] = j;
                }
            }
        }

        while(!water.isEmpty()) {
            Integer[] cur = water.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + directions[i][0];
                int ny = cur[1] + directions[i][1];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C || dist[nx][ny] <= dist[cur[0]][cur[1]] + 1) continue;
                if (maps[nx][ny] == 'X' || maps[nx][ny] == 'D') continue;
                water.offer(new Integer[]{nx, ny});
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
            }
        }

        Integer[] peek = hedgehog.peek();
        dist[peek[0]][peek[1]] = 0;
        while(!hedgehog.isEmpty()) {
            Integer[] cur = hedgehog.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + directions[i][0];
                int ny = cur[1] + directions[i][1];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C || dist[nx][ny] <= dist[cur[0]][cur[1]] + 1) continue;
                if (maps[nx][ny] == 'X') continue;
                hedgehog.offer(new Integer[]{nx, ny});
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
            }
        }

        System.out.print(dist[goal[0]][goal[1]] == Integer.MAX_VALUE ? "KAKTUS" : dist[goal[0]][goal[1]]);
    }



    static void getInput() {
        R = sc.nextInt();
        C = sc.nextInt();
        dist = new int[R][C];
        maps = new char[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < C; j++) {
                maps[i][j] = chars[j];
            }
        }
    }
}