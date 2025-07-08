import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int C = 0;
        for (int i = 0; i < L; i++) C += i;
        for (;;) {
            if ((N - C) / L < 0 || L > 100) {
                System.out.print(-1);
                break;
            }

            if ((N - C) % L == 0) {
                int start = (N - C) / L;
                int end = start + L;
                StringBuilder sb = new StringBuilder();
                for (int i = start; i < end; i++) {
                    sb.append(i).append(" ");
                }
                System.out.print(sb);
                break;
            } else {
                C += L;
                L++;
            }
        }

    }
}