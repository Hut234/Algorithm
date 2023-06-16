import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		if(b<4) {
			System.out.println(0);
			return;
		}
		long bVal = (long) (b/2)*(b/2) + b/2;
		long aVal;
		if(a<3) {
			aVal = 2;
		} else {
			aVal = (long) ((a-1)/2)*((a-1)/2) + ((a-1)/2);
		}
		System.out.println(bVal-aVal);
	}
}