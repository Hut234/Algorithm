import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
		int X = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int idx = 1;
		int tmp = 1 ;
		int inc = 2;
		while(true) {
			if(X<=tmp) break;
			tmp += inc;
			idx++;
			inc++;
		}
		int ja = 1+(tmp-X);
		int mo = idx-(tmp-X);
		if(idx%2!=0) {
			System.out.println(ja + "/" + mo);
		}else {
			System.out.println(mo + "/" + ja);
		}
	}
}