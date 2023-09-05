import java.util.Scanner;
class Main{
    static long[] arr = new long[91];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr[1] = 1;
        for(int i=2; i<=N; i++) arr[i] = arr[i-1] + arr[i-2];
        System.out.print(arr[N]);
    }
}