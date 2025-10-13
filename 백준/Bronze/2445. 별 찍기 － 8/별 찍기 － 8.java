import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            print(sb, N, i);
        }
 
        for (int i = N - 1; i > 0; i--) {
            print(sb, N, i);
        }

        System.out.print(sb);
    }

    private static void print(StringBuilder sb, int N, int i) {
        int stars = i;
        int spaces = (N - i) * 2;

        sb.append("*".repeat(stars));
        sb.append(" ".repeat(spaces));
        sb.append("*".repeat(stars));
        sb.append("\n");
    }
}