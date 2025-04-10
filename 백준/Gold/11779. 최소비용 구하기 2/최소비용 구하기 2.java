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
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            graph[from].add(new Bus(end, time));
        }

        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        int[] dijkstra = new int[N + 1];
        Arrays.fill(dijkstra, Integer.MAX_VALUE);


        boolean[] visited = new boolean[N + 1];
        Queue<Bus> queue = new PriorityQueue<>();
        queue.offer(new Bus(from, 0));
        while (!queue.isEmpty()) {
            Bus cur = queue.poll();

            if (cur.number == to) {
                cur.parents.add(cur.number);
                System.out.println(cur.time);
                System.out.println(cur.parents.size());
                for (Integer number : cur.parents) {
                    System.out.print(number + " ");
                }
                return;
            }

            if (visited[cur.number]) continue;
            visited[cur.number] = true;

            for (Bus next : graph[cur.number]) {
                if (next.time + cur.time <= dijkstra[next.number]) {
                    next.update(cur);
                    dijkstra[next.number] = next.time;
                    queue.add(next);
                }
            }
        }
    }

    static class Bus implements Comparable<Bus> {
        int number;
        int time;
        List<Integer> parents = new ArrayList<>();

        Bus(int number, int time) {
            this.number = number;
            this.time = time;
        }

        void update(Bus parent) {
            this.time += parent.time;
            this.parents = new ArrayList<>(parent.parents);
            this.parents.add(parent.number);
        }

        @Override
        public int compareTo(Bus o) {
            return this.time - o.time;
        }
    }
}