import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), max = 0;
        String str = br.readLine();
        Set<Character> set = new HashSet<>();
        for(int s=0, e=0; s<str.length()&&e<str.length();) {
            if(set.size() > N) {
                max = Integer.max(max, e-s-1);                
                s++;
                e = s; 
                set.clear();
            } else {
                set.add(str.charAt(e));
                e++;
            }
            if(e==str.length()) {
                if(set.size()>N) {
                    max = Integer.max(max, e-1-s);
                } else {
                    max = Integer.max(max, e-s);
                }
                  break;
            }
        }
        System.out.print(max);
    }
}