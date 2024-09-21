import java.io.*;
import java.util.Stack;

class Main {
  static int N;
  static int M;
  static boolean[] visited;
  static Stack<Integer> stack = new Stack<>();
  static StringBuilder result = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    N = Integer.parseInt(s[0]);
    M = Integer.parseInt(s[1]);
    visited = new boolean[N+1];
    recur(0);
    System.out.println(result);
  }

  private static void recur(int size) {
    // base case
    if (size == M) {
      for (Integer i : stack) {
        result.append(i).append(" ");
      }
      result.deleteCharAt(result.length()-1).append("\n");
      return;
    }

    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        stack.push(i);
        recur(size+1);

        visited[i] = false;
        stack.pop();
      }
    }
  }
}