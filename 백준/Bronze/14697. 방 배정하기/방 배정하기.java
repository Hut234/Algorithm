import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int N = Integer.parseInt(s[3]);
        if(A==1) {
            System.out.print(1);
            return;
        }
        if(B%A==0 && C%A == 0) {
            if(N%A==0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
            return;
        }
        int tmpA, tmpB, tmpC;
        for(int i=0; i<=300; i++) {
            tmpA = i*A;
            for(int j=0; j+i<=300; j++) {
                tmpB = j*B;
                for(int k=0; k+j+i<=300; k++) {
                    tmpC = k*C;
                    if(tmpA+tmpB+tmpC==N) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }
}