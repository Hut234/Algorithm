import java.io.*;
class Main {
    private static int K;
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] s1 = br.readLine().split(" ");
        K = Integer.parseInt(s1[0]);
        int N = Integer.parseInt(s1[1]);
        long sum = 0;
        arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        long s = 0, e = sum/N, mid = e;
        while (s <= e) {
            if (count(mid) >= N) {
                s = mid+1;
            }
            else e = mid-1;
            mid = (s+e) /2;
        }
        System.out.print(mid);
    }
    private static long count(long mid) {
        long cnt = 0;
        for (int i = 0; i < K; i++) {
            cnt += arr[i] /mid;
        }
        return cnt;
    }
}
