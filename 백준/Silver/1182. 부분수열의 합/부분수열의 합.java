import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int result = 0;
    static int[] numbers;
    static int n;
    static int s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NS = br.readLine().split(" ");
        n = Integer.parseInt(NS[0]);
        s = Integer.parseInt(NS[1]);

        numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        recursion(0, 0);

        System.out.println(result);
    }

    static void recursion(int index, int sum) {
        if (index == n) return;
        if (sum + numbers[index] == s) result++;

        recursion(index + 1, sum + numbers[index]);
        recursion(index + 1, sum);
    }
}
