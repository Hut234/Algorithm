import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] isExisted = new boolean[20_000_000];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            isExisted[Integer.parseInt(st.nextToken()) +10_000_000] = true;
        }

        int M = Integer.parseInt(br.readLine());
        int[] comparingCards = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            comparingCards[i] = Integer.parseInt(st.nextToken()) +10_000_000;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (isExisted[comparingCards[i]]) sb.append("1");
            else sb.append("0");
            sb.append(" ");
        }

        System.out.print(sb);
    }
}
