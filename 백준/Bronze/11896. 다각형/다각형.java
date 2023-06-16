import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		long sum = 0;
		if(a%2!=0) a += 1;
		if(a==2) a += 2;
		for(int i=a;i<=b;i+=2) sum+=i;
		System.out.println(sum);
	}
}