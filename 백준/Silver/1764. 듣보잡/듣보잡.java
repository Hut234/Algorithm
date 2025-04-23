import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] neverListen = new String[N];
        for (int i = 0; i < N; i++) {
            neverListen[i] = br.readLine();
        }
        Arrays.sort(neverListen);

        String[] neverSeen = new String[M];
        for (int i = 0; i < M; i++) {
            neverSeen[i] = br.readLine();
        }
        Arrays.sort(neverSeen);

        int count = 0;
        for (int i = 0; i < N; i++) {
            String x = neverListen[i];
            int start = 0, end = M - 1;
            boolean flag = false;
            while (start <= end) {
                int mid = (start + end) / 2;
                String cur = neverSeen[mid];
                if (cur.compareTo(x) < 0)  {
                    start = mid + 1;
                } else if (cur.equals(x)) {
                    flag = true;
                    break;
                } else {
                    end = mid - 1;
                }
            }
            if (flag) {
                count++;
                sb.append(x).append("\n");
            }
        }

        System.out.println(count);
        System.out.print(sb);
    }
}