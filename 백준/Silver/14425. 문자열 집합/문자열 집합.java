import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();;
        }

        Arrays.sort(words);

        Map<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String findWord = br.readLine();
            counts.compute(findWord, (k, v) -> (v == null) ? 1 : v + 1);
        }

        int answer = 0;
        for (String findWord : counts.keySet()) {
            int start = 0, end = N - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int result = words[mid].compareTo(findWord);
                if (result > 0) {
                    end = mid - 1;
                } else if (result < 0) {
                    start = mid + 1;
                } else {
                    answer += counts.get(findWord);
                    break;
                }
            }
        }

        System.out.print(answer);
    }
}
