import java.util.Scanner;

class Main {
    
    static int N;
    static int K;
    static int[] drinks;
    
    public static void main(String[] args) {
        getInput();
        solve();
    }
    
    public static void getInput() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        
        drinks = new int[N];
        for (int i = 0; i < N; i++) drinks[i] = sc.nextInt();
    }
    
    public static void solve() {
        int start = 0, end = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (determination(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        System.out.print(end);
    }
    
    public static boolean determination(int target) {
        int count = 0;
        for (int drink : drinks) count += drink / target;
        return count >= K;
    }
}