import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> values = new ArrayList<>();
        while (N-- > 0) {
            values.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(values);
        
        StringBuilder sb = new StringBuilder();
        int len = values.size();
        for (int i = 0; i < len; i++) {
            sb.append(values.get(i)).append("\n");
        }
        
        System.out.print(sb);
    }
}