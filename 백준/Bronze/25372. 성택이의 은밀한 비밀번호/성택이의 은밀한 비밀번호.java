import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            int len = br.readLine().length();
            if (len >= 6 && len <= 9) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}