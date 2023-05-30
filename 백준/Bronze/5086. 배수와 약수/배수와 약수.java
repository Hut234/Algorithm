import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String[] str = br.readLine().split(" ");
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			if(A+B == 0) break;
			System.out.println(
					A>B ? (A%B==0 ? "multiple" : "neither") 
						: (B%A==0 ? "factor" : "neither")
			);
		}
	}
}