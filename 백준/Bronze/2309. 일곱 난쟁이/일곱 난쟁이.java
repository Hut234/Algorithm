import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[] heights = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            sum += height;
            heights[i] = height;
        }

        Arrays.sort(heights);

        int wrongDwarf1 = -1, wrongDwarf2 = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) continue;

                if (sum -heights[i] -heights[j] == 100) {
                    wrongDwarf1 = i;
                    wrongDwarf2 = j;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == wrongDwarf1 || i == wrongDwarf2) continue;
            sb.append(heights[i]).append("\n");
        }

        System.out.print(sb);
    }
}
