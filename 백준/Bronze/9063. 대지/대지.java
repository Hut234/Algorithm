import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==1) {
            System.out.print(0);
        } else {
            int[] x = new int[N];
            int[] y = new int[N];
            int minX = 10001;
            int maxX = -10001;
            int minY = 10001;
            int maxY = -10001;
            for(int i=0; i<N; i++) {
                String[] s = br.readLine().split(" ");
                x[i] = Integer.parseInt(s[0]);
                minX = Integer.min(minX, x[i]);
                maxX = Integer.max(maxX, x[i]);

                y[i] = Integer.parseInt(s[1]);
                minY = Integer.min(minY, y[i]);
                maxY = Integer.max(maxY, y[i]);
            }
            System.out.print((minX-maxX)*(minY-maxY));
        }
    }
}