import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int A;
    static int B;
    static int C;
    static boolean[][][] visited = new boolean[201][201][201];
    static boolean[] result = new boolean[201];

    public static void main(String[] args) {
        getInput();
        solve();
    }

    static void solve() {

        dfs(0, 0, C);

        for (int i = 0; i <= 200; i++) {
            if (result[i]) sb.append(i).append(" ");
        }
        
        System.out.print(sb);
    }

    static void dfs(int a, int b, int c) {
        if (visited[a][b][c]) return;
        visited[a][b][c] = true;

        if (a == 0) result[c] = true;

        for (int from = 0; from < 3; from++) {
            for (int to = 0; to < 3; to++) {
                if (from == to) continue;
                int[] abc = pour(new int[] {a, b, c}, from, to);
                dfs(abc[0], abc[1], abc[2]);
            }
        }


    }

    static int[] pour(int[] bottles, int from, int to) {
        int[] limits = {A, B, C};
        if (bottles[from] + bottles[to] > limits[to]) {
            bottles[from] -= limits[to] - bottles[to];
            bottles[to] = limits[to];
        } else {
            bottles[to] += bottles[from];
            bottles[from] = 0;
        }

        return bottles;
    }

    static void getInput() {
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }
}