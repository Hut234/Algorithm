import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		BigInteger bi1 = new BigInteger(str[0]);
		BigInteger bi2 = new BigInteger(str[1]);;
		System.out.println(bi1.add(bi2));
	}
}