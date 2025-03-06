import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> logs = new TreeSet<>(Collections.reverseOrder());
        while (N-- > 0) {
            String[] log = br.readLine().split(" ");
            String key = log[0];
            if (logs.contains(key)) logs.remove(key);
            else logs.add(key);
        }

        String[] names = logs.toArray(new String[0]);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String name : names) {
            bw.write(name + "\n");
        }
        bw.flush();
    }
}