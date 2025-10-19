import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        System.out.print(A.multiply(B));
    }
}