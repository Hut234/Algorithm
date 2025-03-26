import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ABC = br.readLine().split(" ");
        int A = Integer.parseInt(ABC[0]);
        int B = Integer.parseInt(ABC[1]);
        int C = Integer.parseInt(ABC[2]);

        System.out.print(power(A, B, C));
        
    }

    static long power(int base, int exponent, int divisor) {
        if (exponent == 1) return base % divisor;
        long half = power(base, exponent / 2, divisor);
        if (exponent % 2 == 0) return half * half % divisor;
        return (half * half % divisor) * base % divisor;
    }
}