import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int countA = Integer.parseInt(st.nextToken());
            int countB = Integer.parseInt(st.nextToken());

            int[] A = new int[countA];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < countA; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            int[] B = new int[countB];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < countB; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(B);
            int result = 0;
            for (int i = 0; i < countA; i++) {
                int X = A[i];
                int start = 0, end = countB - 1;

                while (start <= end) {
                    int mid = (start + end) / 2;
                    int cur = B[mid];
                    if (X <= cur) {
                        end = mid - 1;
                    } else {
                        if (mid == countB - 1 || B[mid + 1] >= X) {
                            result += mid + 1;
                            break;
                        } else {
                            start = mid + 1;
                        }
                    }
                }
            }
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}