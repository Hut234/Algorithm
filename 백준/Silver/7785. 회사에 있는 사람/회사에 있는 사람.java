
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> logs = new HashSet<>();
        while (N-- > 0) {
            String[] log = br.readLine().split(" ");
            String key = log[0];
            if (logs.contains(key)) logs.remove(key);
            else logs.add(key);
        }

        List<String> names = new ArrayList<>(logs);
        names.sort(Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for (String name : names) {
            answer.append(name).append("\n");
        }

        System.out.print(answer);
    }
}