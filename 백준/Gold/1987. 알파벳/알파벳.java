
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static int r;
    static int c;
    static String[][] alphabets;
    static int[][] counts;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] rc = br.readLine().split(" ");
        r = Integer.parseInt(rc[0]);
        c = Integer.parseInt(rc[1]);

        alphabets = new String[r][c];
        counts = new int[r][c];
        for (int i = 0; i < r; i++) {
            String[] inputs = br.readLine().split("");
            System.arraycopy(inputs, 0, alphabets[i], 0, inputs.length);
        }

        recursion(0, 0, new HashMap<>());
        System.out.print(result);
    }

    static void recursion(int row, int column, Map<String, Integer> collect) {
        if (row < 0 || row == r) return;
        if (column < 0 || column == c) return;
        if (collect.containsKey(alphabets[row][column])) return;

        collect.put(alphabets[row][column], 1);
        result = Integer.max(collect.size(), result);

        recursion(row, column + 1, collect);
        recursion(row + 1, column, collect);
        recursion(row - 1, column, collect);
        recursion(row, column - 1, collect);
        collect.remove(alphabets[row][column]);
    }
}
