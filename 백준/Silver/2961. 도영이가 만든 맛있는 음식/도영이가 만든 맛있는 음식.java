import java.io.*;
import java.util.*;

public class Main {

  static int N, result = Integer.MAX_VALUE;
  static int[] sour, bitter;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());

    sour = new int[N];
    bitter = new int[N];

    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      sour[i] = Integer.parseInt(st.nextToken());
      bitter[i] = Integer.parseInt(st.nextToken());
    }

    recur(0, 1, 0);
    System.out.println(result);
  }

  private static void recur(int idx, int s, int b) {
    if (idx == N) {
      int abs = Math.abs(s - b);
      if (s != 1) {
        result = Integer.min(result, Math.abs(s - b));
      }
      return;
    }

    recur(idx+1, s*sour[idx], b+bitter[idx]);
    recur(idx+1, s, b);
  }
}