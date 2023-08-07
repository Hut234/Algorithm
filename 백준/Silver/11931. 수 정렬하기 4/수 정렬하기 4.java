import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] vals = new Integer[N];
        for(int i=0; i<N; i++) {
            vals[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(vals, (o1, o2) -> o2-o1);
        StringBuilder sb = new StringBuilder();
        for(Integer i : vals) sb.append(i).append("\n");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}