import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s;
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            s = br.readLine().split(" ");
            sb.append(Integer.parseInt(s[0])+Integer.parseInt(s[1])).append("\n");
        }
        System.out.print(sb);
    }
}