import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] lines = new int[N];
        int max = -1;
        for (int i = 0; i < N; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            max = Integer.max(max, lines[i]);
        }

        Arrays.sort(lines);

        long start = 1, end = max;
        long answer = -1;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (isEnough(lines, mid, K)) {
                start = mid + 1;
                answer = Long.max(answer, mid);
            }
            else end = mid - 1;
        }

        System.out.print(answer);
    }

    private static boolean isEnough(int[] lines, long cuttingLength, int k) {
        long sum = 0;
        for (int line : lines) {
            sum += line / cuttingLength;
        }
        return sum >= k;
    }
}
