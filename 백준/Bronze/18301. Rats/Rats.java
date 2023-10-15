import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        String[] s = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        System.out.print( (Integer.parseInt(s[0])+1) * (Integer.parseInt(s[1])+1) / (Integer.parseInt(s[2])+1) -1 );
    }
}