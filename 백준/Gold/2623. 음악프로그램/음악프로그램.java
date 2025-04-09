import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        List<Integer>[] graph = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[N + 1];
        for (int i = 0; i < M; i++) {
            String[] inputs = br.readLine().split(" ");
            int length = Integer.parseInt(inputs[0]);
            int behind = Integer.parseInt(inputs[length]);
            int front;
            for (int j = length -  1; j > 0; j--) {
                front = Integer.parseInt(inputs[j]);
                graph[front].add(behind);
                indegree[behind]++;
                behind = front;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        int[] visited = new int[N + 1];
        while (!queue.isEmpty()) {
            Integer cur = queue.poll();
            visited[cur]++;
            sb.append(cur).append("\n");

            for (Integer behind : graph[cur]) {
                indegree[behind]--;
                if (indegree[behind] == 0)  queue.offer(behind);
            }
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == 0 || visited[i] > 1) {
                System.out.print(0);
                return;
            }
        }

        System.out.print(sb);
    }
}