import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
                Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) return o1 - o2;
            return abs1 - abs2;
        });
        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.isEmpty()) sb.append("0");
                else sb.append(pq.poll());
                sb.append("\n");
            }
            else pq.offer(x);
        }

        System.out.print(sb);
    }
}