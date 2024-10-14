import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] colCnt = new int[1001];
        colCnt[1] = 3;
        for(int i=2; i<=1000; i++) {
            colCnt[i] = colCnt[i-1];
            for(int j=1; j<i; j++) {
                if(gcd(j, i)) colCnt[i]+=2;
            }
        } 
        int C = Integer.parseInt(br.readLine());
        int N, cnt;
        while(C-->0){
            N = Integer.parseInt(br.readLine());
            cnt = colCnt[N];
            System.out.println(cnt);
        }
    }
    private static boolean gcd(int x, int y) {
        int tmp = 0;
        while(x!=0){
            tmp = y%x;
            y = x;
            x = tmp;
        }
        return y==1;
    }
}