import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }

            for (int j = 1; j <= i; j++) {
                sb.append("*");
                if (j != i) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
