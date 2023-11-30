import java.io.*;
class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] s;
        while(N-->0){
            s = br.readLine().split(" ");
            for(int i=2; i<s.length; i++) sb.append(s[i]).append(" ");
            sb.append(s[0]).append(" ").append(s[1]).append("\n");
        }
        System.out.print(sb);
    }
}