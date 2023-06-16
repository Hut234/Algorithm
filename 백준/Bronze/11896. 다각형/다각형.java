import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		long sum = 0;
		for(int i=a; i<=b; i++) {
            if(i==2) continue;
			if(i%2==0) sum+=i;
		}
		System.out.println(sum);
	}
}