import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static int N, result = Integer.MAX_VALUE;
  static int[] protein, fat, calorie, vitamin, price;
  static boolean[] visited;
  static StringBuilder sResult;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());

    visited = new boolean[N+1];
    protein = new int[N+1];
    fat = new int[N+1];
    calorie = new int[N+1];
    vitamin = new int[N+1];
    price = new int[N+1];

    StringTokenizer st = new StringTokenizer(br.readLine());
    protein[0] = Integer.parseInt(st.nextToken());
    fat[0] = Integer.parseInt(st.nextToken());
    calorie[0] = Integer.parseInt(st.nextToken());
    vitamin[0] = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      protein[i] = Integer.parseInt(st.nextToken());
      fat[i] = Integer.parseInt(st.nextToken());
      calorie[i] = Integer.parseInt(st.nextToken());
      vitamin[i] = Integer.parseInt(st.nextToken());
      price[i] = Integer.parseInt(st.nextToken());
    }

    recur(1, 0, 0, 0, 0, 0);
    if (result == Integer.MAX_VALUE) {
      System.out.print(-1);
    } else {
      System.out.println(result);
      System.out.print(sResult);
    }
  }

  private static void recur(int idx, int p, int f, int c, int v, int pc) {

    if (pc > result) return;

    if (protein[0] <= p && fat[0] <= f && calorie[0] <= c && vitamin[0] <= v) {
      if (result > pc) {
        result = pc;
        sResult = new StringBuilder();
        for (int i = 1; i < N+1; i++) {
          if(visited[i]) {
            sResult.append(i).append(" ");
          }
        }
      }
    }

    if (idx == N+1) return;

    visited[idx] = true;
    recur(idx+1, p+protein[idx], f+fat[idx], c+calorie[idx], v+vitamin[idx], pc+price[idx]);
    visited[idx] = false;
    recur(idx+1, p, f, c, v, pc);
  }
}