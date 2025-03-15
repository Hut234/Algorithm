import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] solutions = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solutions);


        int minValue = Integer.MAX_VALUE;
        int first = 0, second = 0;
        int start = 0, end = N - 1;
        while (start < end) {
            int sum = solutions[start] + solutions[end];
            if (sum > 0) {
                if (minValue > Math.abs(sum)) {
                    first = start;
                    second = end;
                    minValue = Math.abs(sum);
                }
                end--;
            } else if (sum < 0) {
                if (Math.abs(minValue) > Math.abs(sum)) {
                    first = start;
                    second = end;
                    minValue = Math.abs(sum);
                }
                start++;
            } else {
                first = start;
                second = end;
                break;
            }
        }
        System.out.print(solutions[first] + " " + solutions[second]);
    }
}