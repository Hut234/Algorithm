import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] prefix = new int[N+1];


    int tmp, max = -100000001, idx = 1;
    while (st.hasMoreTokens()) {
      tmp = Integer.parseInt(st.nextToken());
      prefix[idx] = Integer.max(tmp, prefix[idx-1] + tmp);
      max = Integer.max(max, prefix[idx]);
      idx++;
    }
    System.out.print(max);
  }
}