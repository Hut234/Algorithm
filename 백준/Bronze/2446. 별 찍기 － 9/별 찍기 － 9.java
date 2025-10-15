import java.util.Scanner;

class Main {

    private static StringBuilder sb;
    private static int N;
  
    public static void main(String[] args) {
        N = new Scanner(System.in).nextInt();
        
        sb = new StringBuilder();
        for (int i = N; i > 0; i--) {
            print(i);
        }
        for (int i = 2; i <= N; i++) {
            print(i);
        }
        
        System.out.print(sb);
    }
    
    private static void print(int i) {
        int spaces = N - i;
        int stars = (2 * i) - 1;
        sb.append(" ".repeat(spaces));
        sb.append("*".repeat(stars));
        sb.append("\n");
    }
}