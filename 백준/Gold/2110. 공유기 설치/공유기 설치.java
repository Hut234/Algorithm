import java.util.Arrays;
import java.util.Scanner;

class Main {
    static int N;
    static int C;
    static int[] houses;
    public static void main(String[] args) {
        getInput();
        solve();
    }

    public static void getInput() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        C = sc.nextInt();

        houses = new int[N];
        for (int i = 0; i < N; i++) houses[i] = sc.nextInt();
        Arrays.sort(houses);
        sc.close();
    }

    public static void solve() {
        int start = 1, end = 1000000000;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (determination(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.print(end);
    }

    public static boolean determination(int target) {
        int count = 1;
        int prev = houses[0];
        for (int i = 1; i < N; i++) {
            if (houses[i] - prev >= target) {
                prev = houses[i];
                count++;
            }
        }

        return count >= C;
    }
}