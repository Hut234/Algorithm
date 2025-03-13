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
        for (int i = 1; i <= N; i++) {
            int start = i, end = N;
            while (start <= end) {
                int mid = (start + end) / 2;
                int sum = accumulate[mid] - accumulate[i - 1];
                if (sum > M) end = mid - 1;
                else if (sum < M) start = mid + 1;
                else {
                    answer++;
                    break;
                }
            }

        }


        System.out.print(answer);
    }
}
