import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        NumBall[] numBalls = new NumBall[N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            numBalls[i] = new NumBall(st.nextToken(), st.nextToken(), st.nextToken());
        }


        int result = 0;
        for (int h = 1; h <= 9; h++) {
            for (int t = 1; t <= 9; t++) {
                if (t == h) continue;
                for (int u = 1; u <= 9; u++) {
                    if (u == h) continue;
                    if (u == t) continue;;

                    boolean flag = true;
                    for (int i = 0; i < N; i++) {
                        NumBall numBall = numBalls[i];

                        int strikeCount = 0;
                        if (numBall.hundred == h) strikeCount++;
                        if (numBall.ten == t) strikeCount++;
                        if (numBall.unit == u) strikeCount++;

                        int ballCount = 0;
                        if (numBall.ten == h || numBall.unit == h) ballCount++;
                        if (numBall.hundred == t || numBall.unit == t) ballCount++;
                        if (numBall.hundred == u || numBall.ten == u) ballCount++;

                        if (numBall.strikeCount != strikeCount || numBall.ballCount != ballCount) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) result++;
                }
            }
        }

        System.out.print(result);
    }

    private static class NumBall {
        int unit;
        int ten;
        int hundred;
        int strikeCount;
        int ballCount;

        private NumBall(String value, String strike, String ball) {
            int val = Integer.parseInt(value);
            this.unit = val %10;
            this.ten = val /10 %10;
            this.hundred = val /100;
            this.strikeCount = Integer.parseInt(strike);
            this.ballCount = Integer.parseInt(ball);
        }

    }

}
