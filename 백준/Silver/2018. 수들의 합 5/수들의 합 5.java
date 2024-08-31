import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int s = 0, e = 0;
        long sum = 0;
        while (e != N) {
            if (sum == N) {
                cnt++;
                sum += ++e;
            } else if (sum < N) {
                sum += ++e;
            } else if (sum > N) {
                sum -= ++s;
            }
        }

        System.out.println(cnt);
    }
}