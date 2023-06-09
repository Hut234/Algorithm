import java.io.*;
class Main{
    public static void main(String[] a)throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString((int)Math.sqrt(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()))));
		bw.flush(); bw.close();
    }}