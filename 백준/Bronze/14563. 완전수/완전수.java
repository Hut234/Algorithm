import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[T];
		for(int i=0; i<T; i++) arr[i] = Integer.parseInt(input[i]);
		int sum, idx=0;
		while(idx<T) {
			sum = 0;
			for(int i=2; i<arr[idx]; i++) {
				if(arr[idx]%i==0) sum += i;
			}
			if(arr[idx]!=1) sum +=1;
			if(arr[idx]>sum) {
				System.out.println("Deficient");
			} else if(arr[idx]==sum) {
				System.out.println("Perfect");
			} else {
				System.out.println("Abundant");
			}
			idx++;
		}
	}
}