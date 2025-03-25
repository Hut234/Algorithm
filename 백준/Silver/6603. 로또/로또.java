import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] info = br.readLine().split(" ");
        while (info.length != 1) {
            int k = Integer.parseInt(info[0]);
            int[] lottos = new int[k];
            for (int i = 0; i < k; i++) {
                lottos[i] = Integer.parseInt(info[i + 1]);
            }
            Arrays.sort(lottos);
            recursion(0, 0, new int[6], lottos, k);
            sb.append("\n");
            info = br.readLine().split(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    static void recursion(int index, int start, int[] result, int[] lottos, int k) {
        if (index == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < k; i++) {
            result[index] = lottos[i];
            recursion(index + 1, i + 1, result, lottos, k);
        }
    }
}
