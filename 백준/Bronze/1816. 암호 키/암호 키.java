import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt; long tmp;
        while(N-->0){
            cnt = 0;
            tmp = Long.parseLong(br.readLine());
            for(int i=2; i<=Math.sqrt(tmp)&&i<=1000000; i++){
                if(tmp%i==0) {
                    cnt++;
                    System.out.println("NO");
                    break;
                }
            }
            if(cnt==0) System.out.println("YES");
        }
    }
}