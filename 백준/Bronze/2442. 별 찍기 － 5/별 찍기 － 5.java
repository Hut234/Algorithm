import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int spaces = N - i;
            int stars = (2 * i) - 1;
            
            for (int sp = 0; sp < spaces; sp++) sb.append(" ");
            for (int st = 0; st < stars; st++) sb.append("*");
            sb.append("\n");            
        }
        System.out.print(sb);
    }
}