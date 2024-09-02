import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 1, j; (j = i *(i+1) /2) <= N; i++) {
            if ((N -(i*(i-1) /2)) %i == 0) cnt++;
        }

        System.out.print(cnt);
    }
}