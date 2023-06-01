import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int a1 = Integer.parseInt(a[0]);
		int a0 = Integer.parseInt(a[1]);
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
	    boolean flag = true;
		for(int i=n0; i<101; i++) {
			if((a1*i + a0) > c*i) {
				flag = false;
				break;
			}
		}
		System.out.println(flag == true ? 1 : 0);
    }
}