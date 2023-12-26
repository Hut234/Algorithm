import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;
        for(int i=0; i<N; i++) {
            if(s.charAt(i)=='p'&&i+3<N) {
                String substring = s.substring(i, i + 4);
                if(substring.equals("pPAp")) {
                    result++;
                    i += 3;
                }
            }
        }
        System.out.print(result);
    }
}