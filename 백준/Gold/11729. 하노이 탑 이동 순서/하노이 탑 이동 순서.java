import java.util.Scanner;

class Main {

    static int moveCount = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        solve(n, 1, 3);
        System.out.println(moveCount);
        System.out.print(sb);
    }

    private static void solve(int n, int start, int end) {
        if (n == 0) return;
        solve(n - 1, start, 6 - start - end);
        moveCount++;
        sb.append(start).append(" ").append(end).append("\n");
        solve(n - 1, 6 - start - end, end);
    }
}