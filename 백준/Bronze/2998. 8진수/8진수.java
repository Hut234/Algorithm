import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split("");

		BigInteger result =  BigInteger.ZERO;
		BigInteger multiply = BigInteger.ONE;
		for (int i = str.length - 1; i > -1; i--, multiply = multiply.multiply(BigInteger.valueOf(2))) {
			result = result.add(new BigInteger(str[i]).multiply(multiply));
		}

		StringBuilder sb = new StringBuilder();
		while (!result.equals(BigInteger.ZERO)) {
			sb.append(result.mod(BigInteger.valueOf(8)));
			result = result.divide(BigInteger.valueOf(8));
		}

		System.out.print(sb.reverse());
	}
}
