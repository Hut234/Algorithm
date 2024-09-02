import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int s = 1, e = 1;
        int sum = 0;
        while (e < N) {
            sum = (e-s+1) *(s+e) /2;
            if (sum == N) {
                cnt++;
                e++;
            } else if (sum < N) {
                e++;
            } else if (sum > N) {
                s++;
            }
        }

        System.out.print(cnt);
    }
}
