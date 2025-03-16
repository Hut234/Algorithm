import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < N; i++) {
            dictionary.add(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            if (dictionary.contains(br.readLine())) answer++;
        }

        System.out.print(answer);
    }
}
