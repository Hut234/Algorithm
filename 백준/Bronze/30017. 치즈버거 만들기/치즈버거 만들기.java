import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        if (A > B) {
            result = 2*B +1;
        } else {
            result = 2*A -1;
        }
        System.out.print(result);
    }
}