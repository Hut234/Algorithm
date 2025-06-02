import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;
    static int[][] dist;
    static String[] mazes;

    public static void main(String[] args) {
        getInput();
        solve();
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static void solve() {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{0, 0});
        dist[0][0] = 1;
        while (!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = cur[0] + directions[i][0];
                int nextY = cur[1] + directions[i][1];
                if (isOutOfBoundary(nextX, nextY) || mazes[nextX].charAt(nextY) == '0' || dist[nextX][nextY] <= dist[cur[0]][cur[1]] + 1)
                    continue;
                dist[nextX][nextY] = dist[cur[0]][cur[1]] + 1;
                queue.offer(new Integer[]{nextX, nextY});
            }
        }

        System.out.print(dist[N - 1][M - 1]);
    }

    static boolean isOutOfBoundary(int x, int y) {
        return x < 0 || x >= N || y < 0 || y >= M;
    }


    static void getInput() {
        N = sc.nextInt();
        M = sc.nextInt();
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        mazes = new String[N];
        for (int i = 0; i < N; i++) {
            mazes[i] = sc.next();
        }
    }
}