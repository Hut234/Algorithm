import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> cards = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Long key = Long.parseLong(br.readLine());
            cards.put(key, cards.getOrDefault(key, 0) + 1);
        }

        List<Long> cardNumbers = new ArrayList<>(cards.keySet());
        cardNumbers.sort((o1, o2) -> {
            int count1 = cards.get(o2);
            int count2 = cards.get(o1);
            if (count1 != count2) return count1  - count2;
            return o1.compareTo(o2);
        });

        System.out.print(cardNumbers.get(0));
    }
}