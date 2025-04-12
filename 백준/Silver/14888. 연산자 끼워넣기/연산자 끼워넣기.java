import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int[] selected;
    static int min = 1000000001;
    static int max = -1000000001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        selected = new int[N - 1];

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        inputs = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(inputs[i]);
        }


        recur(0);
        System.out.println(max);
        System.out.print(min);
    }

    static void recur(int depth) {
        if (depth == N - 1) {
            int result = numbers[0];
            for (int i = 1, j = 0; i < N && j < depth; i++, j++) {
                if (selected[j] == 0) result += numbers[i];
                else if (selected[j] == 1) result -= numbers[i];
                else if (selected[j] == 2) result *= numbers[i];
                else result /= numbers[i];
            }

            min = Integer.min(min, result);
            max = Integer.max(max, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] == 0) continue;
            operators[i]--;
            selected[depth] = i;
            recur(depth + 1);
            operators[i]++;
        }
    }
}