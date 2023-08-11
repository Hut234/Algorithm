import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i, cnt=0;
        while((i=br.read())> 64) {
        	cnt++;
        	sb.append((char)i);
        	if(cnt%10==0) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}