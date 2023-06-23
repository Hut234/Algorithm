import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] num = new int[N][3];
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            num[i][0] = Integer.parseInt(input[0]);
            num[i][1] = Integer.parseInt(input[1]);
            num[i][2] = Integer.parseInt(input[2]);
        }
        boolean flagA, flagB, flagC;
        for(int i=0; i<N-1; i++) {
            flagA = false; flagB = false; flagC = false;
            for(int j=i+1; j<N; j++) {
                if(num[i][0]==num[j][0]) {
                    flagA = true;
                    num[j][0] = 0;
                }
                if(num[i][1]==num[j][1]) {
                    flagB = true;
                    num[j][1] = 0;
                }
                if(num[i][2]==num[j][2]) {
                    flagC = true;
                    num[j][2] = 0;
                }
            }
            if(flagA) num[i][0] = 0;
            if(flagB) num[i][1] = 0;
            if(flagC) num[i][2] = 0;
            System.out.println(num[i][0] + num[i][1] + num[i][2]);
        }
        System.out.println(num[N-1][0] + num[N-1][1] + num[N-1][2]);
    }
}