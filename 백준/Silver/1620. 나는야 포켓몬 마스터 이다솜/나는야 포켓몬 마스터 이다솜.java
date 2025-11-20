import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        HashMap<String, Integer> nameToIndex = new HashMap<>(N);
        String[] indexToName = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToIndex.put(name, i);
            indexToName[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            String q = br.readLine();

            if (Character.isDigit(q.charAt(0))) {
                int idx = Integer.parseInt(q);
                sb.append(indexToName[idx]);
            } else {
                sb.append(nameToIndex.get(q));
            }

            sb.append('\n');
        }

        System.out.print(sb);
    }
}