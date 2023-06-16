import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		long sum = 0;
		if(a%2!=0) a += 1;
		if(b%2!=0) b -= 1;
		if(a==2) a += 2;
		if(a>b) {
			System.out.println(0);
			return;
		}
		if(b-a==2) {
			System.out.println(a+b);
			return;
		}else if(b-a==0) {
			System.out.println(a);
			return;
		}
		int half = (b-a+1)/2 +1;
		if(half%2==0) {
			sum = (long)(a+b)*half/2;
		} else {
			sum = (long)(a+(b-2))*((half-1)/2) +b;
		}
		System.out.println(sum);
	}
}