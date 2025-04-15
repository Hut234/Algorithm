import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);

        boolean[] visited = new boolean[N];
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[j]) continue;
                if (A[i] == B[j]) {
                    result[i] = j;
                    visited[j] = true;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int value : result) {
            sb.append(value).append(" ");
        }

        System.out.print(sb);
    }
}