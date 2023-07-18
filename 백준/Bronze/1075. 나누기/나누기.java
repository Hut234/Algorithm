import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		N -= getDigit(N);
		for(int i=0; i<100; i++, N++) {
			if(N%F==0) list.add(i);
		}
		Collections.sort(list);
		System.out.println(list.get(0)<10 ? "0"+list.get(0) : list.get(0));
	}
	private static int getDigit(int N) {
		int tens = (N/10) %10; 
		int units = N %10;
		return tens*10 + units;
	}
}