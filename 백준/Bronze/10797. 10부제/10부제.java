import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] s = br.readLine().split(" ");
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(n.equals(s[i])) cnt++;
        }
        System.out.print(cnt);
    }
}