import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s = 2*(Integer.parseInt(input[0]));
        int t = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        System.out.print(t*(d/s));
    }
}