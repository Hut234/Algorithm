import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> ext = new TreeMap<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String key = st.nextToken();
            ext.put(key, ext.getOrDefault(key, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String key : ext.keySet()) {
            sb.append(key).append(" ").append(ext.get(key)).append("\n");
        }
        System.out.print(sb);
    }
}