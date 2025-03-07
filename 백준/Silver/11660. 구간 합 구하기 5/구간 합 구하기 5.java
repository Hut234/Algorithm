import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        StringTokenizer st;
        int[][] accumulate = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                accumulate[i][j] = accumulate[i-1][j] + accumulate[i][j-1] - accumulate[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            bw.write(accumulate[x2][y2] - accumulate[x2][y1-1] - accumulate[x1-1][y2] + accumulate[x1-1][y1-1] + "\n");
        }
        bw.flush();
    }
}
