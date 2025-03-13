import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] accumulate = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            accumulate[i] = accumulate[i-  1] + Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int start = 0, end = 1;
        while (start <= end) {
            if (end > N) break;
            int sum = accumulate[end] - accumulate[start];
            if (sum < M) end++;
            else if (sum > M) start++;
            else {
                answer++;
                start++;
                end++;
            }
        }

        System.out.print(answer);
    }
}
