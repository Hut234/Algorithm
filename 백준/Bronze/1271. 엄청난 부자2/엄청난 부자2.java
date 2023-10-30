import java.math.BigInteger;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        BigInteger b1 = new BigInteger(s[0]);
        BigInteger b2 = new BigInteger(s[1]);
        System.out.println(b1.divide(b2));
        System.out.print(b1.mod(b2));
    }
}