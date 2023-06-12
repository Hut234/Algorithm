import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print(csod(N));
    } 
    static private long csod(int val){
        long sum = 0;
        for(int i=2; i<=val/2; i++){
            sum += ((val/i)-1)*i;
        }
        return sum%1000000;
    }
}