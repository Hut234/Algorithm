import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());


            st = new StringTokenizer(br.readLine());
            List<Building>[] graph = new List[N + 1];
            Building[] buildings = new Building[N + 1];
            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
                buildings[i] = new Building(i, st.nextToken());
            }

            int[] indegree = new int[N + 1];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int before = Integer.parseInt(st.nextToken());
                int after = Integer.parseInt(st.nextToken());
                graph[before].add(buildings[after]);
                indegree[after]++;
            }

            Queue<Building> queue = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                if (indegree[i] == 0) queue.offer(buildings[i]);
            }

            int goal = Integer.parseInt(br.readLine());
            while (!queue.isEmpty()) {
                Building cur = queue.poll();

                if (cur.number == goal) {
                    sb.append(cur.time + cur.needTime).append("\n");
                    break;
                }

                for (Building after : graph[cur.number]) {
                    int nextBuildingNumber = after.number;
                    indegree[nextBuildingNumber]--;
                    buildings[nextBuildingNumber].needTime = Integer.max(buildings[nextBuildingNumber].needTime, cur.needTime + cur.time);
                    if (indegree[nextBuildingNumber] == 0) {
                        queue.offer(buildings[nextBuildingNumber]);
                    }
                }
            }

        }
        System.out.print(sb);
    }

    static class Building {
        int number;
        int time;
        int needTime;

        Building(int number, String time) {
            this.number = number;
            this.time = Integer.parseInt(time);
        }
    }
}