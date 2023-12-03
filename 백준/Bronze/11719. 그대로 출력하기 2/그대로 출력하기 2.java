import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        while(s!=null) {
            sb.append(s).append("\n");
            s = br.readLine();
        }
        System.out.print(sb);
    }
}