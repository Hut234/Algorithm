import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;
    static int[] knightPosition = new int[2];
    static int[][] enemyPosition;
    static int[][] dist;

    public static void main(String[] args) {
        getInput();
        solve();
    }

    static void solve() {
        bfs();
        System.out.print(sb);
    }

    static int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
    static void bfs() {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{knightPosition[0], knightPosition[1], 0});
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nr = cur[0] + directions[i][0];
                int nc = cur[1] + directions[i][1];
                if (nr < 1 || nc < 1 || nr > N || nc > N || cur[2] + 1 >= dist[nr][nc]) continue;
                queue.offer(new Integer[]{nr, nc, cur[2] + 1});
                dist[nr][nc] = cur[2] + 1;
            }
        }

        for (int i = 0; i < M; i++) {
            int findX = enemyPosition[i][0], findY = enemyPosition[i][1];
            sb.append(dist[findX][findY]).append(" ");
        }
    }


    static void getInput() {
        N = sc.nextInt();
        M = sc.nextInt();
        knightPosition = new int[]{sc.nextInt(), sc.nextInt()};
        enemyPosition = new int[M][2];
        for (int i = 0; i < M; i++) {
            enemyPosition[i][0] = sc.nextInt();
            enemyPosition[i][1] = sc.nextInt();
        }
        dist = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[knightPosition[0]][knightPosition[1]] = 0;
    }
}