import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] candies = new String[N][N];
        for (int i = 0; i < N; i++) {
            String[] columns = br.readLine().split("");
            System.arraycopy(columns, 0, candies[i], 0, N);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                max = Integer.max(max, Integer.max(countRow(N, candies, i), countColumn(N, candies, j)));

                if (i+1 < N && !candies[i][j].equals(candies[i+1][j])) {
                    swapRow(candies, i, j);

                    int rowCount = Integer.max(countRow(N, candies, i), countRow(N, candies, i+1));
                    int columnCount = countColumn(N, candies, j);
                    max = Integer.max(max, Integer.max(rowCount, columnCount));

                    swapRow(candies, i, j);
                }

                if (j+1 < N && !candies[i][j].equals(candies[i][j+1])) {
                    swapColumn(candies, i, j);

                    int rowCount = countRow(N, candies, i);
                    int columnCount = Integer.max(countColumn(N, candies, j), countColumn(N, candies, j+1));
                    max = Integer.max(max, Integer.max(rowCount, columnCount));

                    swapColumn(candies, i, j);
                }
            }
        }
        System.out.println(max);
    }

    private static int countColumn(int N, String[][] candies, int j) {
        int max = 0;
        int columnCount = 1;
        for (int k = 0; k < N-1; k++) {
            if (candies[k][j].equals(candies[k+1][j])) columnCount += 1;
            else columnCount = 1;
            max = Integer.max(max, columnCount);
        }
        return max;
    }

    private static int countRow(int N, String[][] candies, int i) {
        int max = 0;
        int rowCount = 1;
        for (int k = 0; k < N-1; k++) {
            if (candies[i][k].equals(candies[i][k+1])) rowCount += 1;
            else rowCount = 1;
            max = Integer.max(max, rowCount);
        }
        return max;
    }

    private static void swapRow(String[][] candies, int i, int j) {
        String tmp = candies[i][j];
        candies[i][j] = candies[i+1][j];
        candies[i+1][j] = tmp;
    }
    private static void swapColumn(String[][] candies, int i, int j) {
        String tmp = candies[i][j];
        candies[i][j] = candies[i][j+1];
        candies[i][j+1] = tmp;
    }
}
