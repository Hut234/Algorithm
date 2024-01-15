import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s1, s2;
        int a, b;
        int c, d;
        int e, f;
        boolean flag;
        StringBuilder sb = new StringBuilder();
        while(!(s[0].equals("00:00")&&s[1].equals("00:00"))){
            s1 = s[0].split(":");
            s2 = s[1].split(":");
            a = Integer.parseInt(s1[0]);
            b = Integer.parseInt(s1[1]);
            c = Integer.parseInt(s2[0]);
            d = Integer.parseInt(s2[1]);
            f = (b+d)%60;
            e = ((b+d)/60 +(a+c))%24;

            flag = ((b+d)/60 + (a+c))/24>0?true:false;

            if(e<10) {
                sb.append(0).append(e);
            } else {
                sb.append(e);
            }
            sb.append(":");
            if(f<10) {
                sb.append(0).append(f);
            } else {
                sb.append(f);
            }
            if(flag) sb.append(" +").append(((b+d)/60 + (a+c))/24);
            sb.append("\n");
            s = br.readLine().split(" ");
        }
        System.out.print(sb);
    }
}