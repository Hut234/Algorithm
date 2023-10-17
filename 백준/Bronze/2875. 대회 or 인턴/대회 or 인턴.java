import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        String[] s = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        int result = 0;
        int tmpN, tmpM;
        for(int i=0, j=K-i; i<=K; i++, j--) {
            tmpN = (N-i) /2;
            tmpM = M-j;
            result = Integer.max(result, Integer.min(tmpN, tmpM));

        }
        System.out.print(result);
    }
}