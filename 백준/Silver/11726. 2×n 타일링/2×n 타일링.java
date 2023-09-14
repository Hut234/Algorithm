import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        arr[0] = 1; arr[1] = 1;
        for(int i=2; i<=N; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) %10007;
        }
        System.out.print(arr[N]);
    }
}