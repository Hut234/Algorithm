import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        String[] referee = br.readLine().split(" ");
        int B = Integer.parseInt(referee[0]);
        int C = Integer.parseInt(referee[1]);
        int tmp;
        long result = 0;
        for(int i=0; i<N; i++) {
            tmp = Integer.parseInt(s[i]) -B;
            if(C > tmp) {
                result = tmp<=0? result+1 : result+2;
            } else {
                if(tmp%C == 0) {
                    result += tmp/C +1;
                } else {
                    result += tmp/C +2;
                }
            }
        }
        System.out.print(result);              
    }
}