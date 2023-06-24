import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int cnt = 0;
        for(int i=666; i<=6669999; i++){
            if(Integer.toString(i).contains("666")) cnt++;
            if(cnt==N) {
                System.out.print(i);
                break;
            }
        }
    }
}