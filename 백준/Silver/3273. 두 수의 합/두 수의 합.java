import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] exist = new boolean[1000001];

        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            numbers[i] = cur;
            exist[cur] = true;
        }

        int X = Integer.parseInt(br.readLine());

        int result = 0;
        int minus;
        for (int i = 0; i < N; i++) {
            minus = X -numbers[i];
            if (minus > 0 && minus < 1000001 && exist[minus]) result++;
        }

        System.out.print(result/2);
    }
}
