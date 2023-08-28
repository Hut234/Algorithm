import java.util.Scanner;
class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) sb.append(i).append("\n");
        System.out.print(sb.deleteCharAt(sb.length()-1).toString());
    }
}