import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }



        for (int i = 0; i < M; i++) {
            int X = B[i];
            String result = "0";
            int start = 0, end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int cur = A[mid];
                if (cur > X) {
                    end = mid - 1;
                } else if (cur == X) {
                    result = "1";
                    break;
                } else {
                    start = mid + 1;
                }
            }
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}