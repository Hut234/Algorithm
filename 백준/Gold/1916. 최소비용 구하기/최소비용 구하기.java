import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());


        List<Bus>[] graph = new List[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            graph[start].add(new Bus(end, time));
        }


        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        Queue<Bus> queue = new PriorityQueue<>();
        queue.offer(new Bus(from, 0));

        int[] dijkstra = new int[N + 1];
        Arrays.fill(dijkstra, Integer.MAX_VALUE);

        boolean[] visited = new boolean[N + 1];
        while (!queue.isEmpty()) {
            Bus cur = queue.poll();
            if (cur.number == end) break;
            visited[cur.number] = true;

            for (Bus next : graph[cur.number]) {
                if (visited[next.number]) continue;
                if (cur.time + next.time < dijkstra[next.number]) {
                    next.time += cur.time;
                    queue.offer(next);
                    dijkstra[next.number] = next.time;
                }
            }

        }

        System.out.print(dijkstra[end]);
    }

    static class Bus implements Comparable<Bus> {
        int number;
        int time;
        Bus(int number, int time) {
            this.number = number;
            this.time = time;
        }

        @Override
        public int compareTo(Bus o) {
            return this.time - o.time;
        }
    }
}